# Building High Performance with Redis

After I performed a demo of my software https://jasperdemo.com to Tim, my programmer friend, he observed: "You will be much better off if you use Redis as backend".

"You see, web software is a kind of Kong fu. You have to be fast", declared Tim. "But MySql has caching, thread pooling, everything", I shot back. Then I felt silent, how can apps running on hard drives beat apps running on memory. Indeed, Tim was all smiles, as if evaluating my stupidity index. "Go back to square one, start everything from bottom up" was Tim's advice.

Emotions aside, I am definitely not going back to square one to start everything from bottom up. As I was studying Redis, the client commands really bother. How can I wrap my codes around the client syntax like that? I want to keep my objects and classes the way they are. After all, we programmers are proud of our classes. They are our secret sauce.  

Keeping your objects intact and interacting with Redis at higher level is why I open source this code. 

In this code demo, I use Spring boot to interact with Redis repository. This way, I do not have to worry about low level Redis commands. Instead of SQL or ORM, you can use RESTFUL API to get, post, put, delete, list your objects, all at Redis speed.

Disclaimer. (1) This code has only been tested on localhost with a stand alone Redis server; (2) The product object here is relatively simple. Efficiently searching complicated objects in large collection have not been touched.

This code is released with MIT license.

