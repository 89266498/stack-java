```
HTML5 Canvas中的坐标系统以左上角为其原点（0, 0）。这个解决方案在屏幕图形学领域并不新鲜（例如windows窗体和svg也是如此）。过去标准的CRT监视器从上到下显示图像行，并且从左到右创建行中的图像。因此，定位原点（0，0）在左上角是直观的，它使创建硬件和软件处理图形更容易。
```

> 可以通过修改传递给绘图方法的y值来解决这个问题：
+ contexnt.fillRect(x, offsetY - y, size, size);