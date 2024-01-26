# Implementing-LRU-Cache-
 <h1> Least Recently Used ( LRU ) Cache Implementation in JAVA </h1>
 
This repository contains a Java implementation of an LRU Cache, a commonly used caching mechanism based on the Least Recently Used policy. LRUCache is designed to store a fixed number of items and automatically evict the least recently used item when the cache reaches its capacity.

<h2>Features:</h2>
<h3>Dynamic Size: </h3> Adjustable capacity to accommodate varying storage requirements.
<h3>Efficient Access: </h3> Quick retrieval of cached items with constant time complexity for both insertions and lookups.
<h3>Automatic Eviction:  </h3>Removes the least recently used item when the cache reaches its limit, ensuring optimal space utilization.
<h2> Usage: </h2>
 <h3>Initialize the LRUCache: </h3>
 Set the desired capacity for the LRUCache.
 
 <h4> LRUCache lruCache = new LRUCache(capacity); </h4>

 <h3> Add an Item to the Cache:</h3>

Use the add method to add a key-value pair to the LRUCache.

<h4>  lruCache.add(key);  </h4>
<h3> Display Cache Contents: </h3>

<h3> View the current contents of the LRUCache using the display method. </h3>h3>

<h4>LRUCache.display();</h4>
<h2>Contributing: </h2>
Feel free to contribute, report issues, or suggest improvements. Your feedback is highly appreciated!
