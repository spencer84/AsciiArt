<h1> AsciiArt </h1>
<h2> First steps into learning Java.</h2>

<p1> About a week ago I made an effort to start teaching myself Java. My primary programming language to-date is Python, but I've heard that learning a statically typed language makes one a better programmer in general. I enjoy the challenge of learning something new and even though I didn't have any reason to use Java for this project, I thought it'd be worth trying out.  </p1>

<p1> The first step in learning any language is of course to write "Hello world!". Even doing something this basic is worth celebrating for anyone starting out. I found Java to be particularly daunting, as doing anything in the language involves a degree of complexity that is pleasantly absent from Python. But with any degree of persistence, this initial frustration fades and `public static void main(String[] args)` begins to make some sense. After successfully compiling my first code in Java, I wanted to dive into a slightly more ambitious project. </p1>

<h2> Why this project? </h2>

<p1> Many years ago, I took guitar lessons in a small room not much larger than a closet. On one wall was a printed out portrait created from text art. The concept stuck with me and part of me has wanted to do my own self-portait using a similar concept since then. Of course, there a number of different ways to use Ascii characters to create art. The idea of using special characters to represent brightness came from the famous <a href="https://www.a1k0n.net/2011/07/20/donut-math.html"> donut code. <a/> </p1>

<p1> Image manipulation isn't something that I had thought too deeply about, nor had any immediate utility for. However, I wanted to do something different than typical beginner projects like building a calculator. Without thinking too deeply about how I'd implement this project, I knew I'd atleast be able to learn how to read/write a file, parse strings (in re-naming the new file), and work with loops in Java.   </p1>

<h2> Design </h2>

<p1> I began this project after glancing at a few other examples of people doing similar image manipulation projects. I couldn't find anything that matched exactly what I was looking for, but I was happy to forge ahead one step at a time. I tried to break this a few basic steps:
  <li> Open the target image </li>
  <li> Adapt the old file name to create a new file name for the output text file </li>
  <li> Iterate through each pixel and convert to an Ascii character </li>
  </p1>
 <p1> Once I got the hang of writing methods and the try/execpt clauses required in certain instances, puting this all together was fairly simple and I was able to break each of these three sections into smaller, Googleable questions. One of the most challenging aspects came in the conversion of an RGB int to individual R, G, and B color codes. The use of bitwise operators was new to me, but I thought this was a very cool solution. I came up with my own quick solution to identify brightness. Since RGB color codes are additive, the larger value would be closer to white. By dividing the total value of all R, G, and B intagers by 64, I was able to assign one of the 12 Ascii characters based on the presumed brightness.</p1>
 

<h2> Usage </h2>

<p1> This script requires one arguement: the relative path and file name to a given image file. To call this script, simply execute `java AsciiArt "YourFileNameHere.jpeg"` If a vaild file path has been provided, the program will prompt the user to determine if the image should be resized. Inputting 'y' for yes returns a separate prompt for the percentage (%) to be rescaled. An integer between 1 and 1000, 1% and 1000%, is accepted. Either resizing or not will output a .txt file of the image recreated via Ascii characters </p1>
  

<h2> Lessons learned and next steps </h2>
  <p1> I really enjoyed this project, even if the end result wasn't as perfect as I had anticipated. Ideally, I would like to create a new image file based on the Ascii characters. The txt file can obfuscate the image if the viewing window isn't properly sized. For larger images, I imagine it would be extremely difficult to fit the entire text file on the screen and view the re-created image. Perhaps some resizing might be neccesary. </p1>
  
  <p1> I probably haven't handled all possible errors and I'd like to have the output in a more readily appreciated format/view, but this is still my first Java project (other than printing "Hello World!" that is!). </p1>
