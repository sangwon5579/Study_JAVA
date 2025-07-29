package com.beyond.hashtable.practice;


import java.util.LinkedList;

public class HashTable<K, V> {
    private int maxSize = 0;
    private LinkedList<HashNode<K, V>>[] buckets;

    public HashTable() {
        this(16);
    }

    public HashTable(int maxSize){
        this.maxSize = maxSize;
        this.buckets = new LinkedList[this.maxSize];
        for(int i = 0; i < this.buckets.length; i++){
            this.buckets[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value){
        int index = this.hash(key);

        for(HashNode<K,V> node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value;

                return;
            }
        }
        buckets[index].add(new HashNode<>(key, value));
    }

    private int hash(K key){
        return Math.abs(key.hashCode() % this.maxSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < this.buckets.length; i++){
            LinkedList<HashNode<K, V>> bucket = this.buckets[i];

            sb.append(i).append(": ").append(bucket).append("\n");
        }

        return sb.toString();
    }

    public int size() {
        int size = 0;
        for (LinkedList<HashNode<K, V>> bucket : buckets) {
            size +=  bucket.size();
        }
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public V get(K key) {
        V value = null;
        int index = this.hash(key);
        for(HashNode<K,V> node : buckets[index]) {
            if (node.key.equals(key)) {
                value = node.value;
                break;
            }
        }
        return value;
    }

    public boolean contains(K key) {
        boolean result = false;
        int index = this.hash(key);
        for(HashNode<K,V> node :buckets[index]){
            if (node.key.equals(key)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public V remove(K key) {
        V value = null;
        int index = this.hash(key);
        for(HashNode<K,V> node : buckets[index]) {
            if (node.key.equals(key)) {
                value = node.value;
                buckets[index].remove(node);
                break;
            }
        }
        return value;
    }

    private static class HashNode<K, V> {

        private K key;
        private V value;
        private HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}
