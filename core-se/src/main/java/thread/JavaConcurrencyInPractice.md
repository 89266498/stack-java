![cmd-markdown-logo](./个性头像.svg)

# __Java多线程实战__


## 简介
 
* 1:并发简史
> * 资源利用率
> * 公平性
> * 便利性

* 2：线程的优势
> * 发挥多处理器的强大能力
> * 建模的简单性
> * 异步事件的简化处理
> * 响应更灵敏的用户界面

* 3：线程带来的风险
> * 安全性问题
> * 活跃型问题(有点类似与安全性问题)
> * 性能问题
> * 线程无处不在

## __基础知识__

### __一:线程安全性__

+ _*一个对象是否需要是线程安全的，取决于它是否被多个线程访问。这指的是在程序中访问对象的方式,而不是对象要实现的功能。也就是说对象提供的调用方式及处理数据的行为是否会被多个线程调用*_

+ _*当上面所说的对象提供的调用机制被多个线程使用就可能会出现"_数据共享_"问题,那么"共享"就是意味着变量可以由多个线程同时访问,而可变则意味着变量的值在生命周期及线程的创建到销毁阶段都可以发生变化,也就是变量可以被任意访问它的线程所操作(需要说明的是当对象设计是考虑了并发问题那么访问它的部分线程则可能会阻塞)*_


+ __再次对对象的所提供给线程访问的机制进行说明,首先当提供的对象访问机制所依赖的环境或者域或者其它因素它们本身就可能引发线程的不安全行为那么这个对象和对象所依赖的域等整体就有引发线程的安全性问题;因此当多个线程访问某个状态变量并且其中有一个线程执行写入操作时，必须才有同步机制来协同这些线程对变量的访问。__


+ __Java中的主要同步机制是关键字synchronized , 它提供了一种独特的加锁方式,但"同步"这个术语还包括volatile类型的变量,显示锁(Explicit Lock)以及原子变量__

> 在上述规则中并不存在一些想象的“例外”情况。即使在某个程序中省略了必要的同步机制，并且看上去似乎能正确执行，而且通过了测试并在随后的几年里都能正确的执行，但程序任然可能在某个时刻发生错误。
```
如果当多个访问同一个可变的状态变量时没有使用合适的同步，那么程序就会出现错误。有三种方式可以修复这个问题:
1:不在线程之间共享该状态变量
2:将状态变量改为不可变的变量。
3:在访问状态变量时使用同步
```


