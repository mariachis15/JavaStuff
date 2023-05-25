01. Basic Java Applications

     2. Write a Java application where you read from the keyboard an int value. Calculate and 
     display the factorial of the read number.
     
     3. Write a Java application that reads from the keyboard 2 integer values and displays their
     greatest common divider (GCD).
     
     4. Write a Java application where you read from the keyboard an integer value and display all 
     its dividers.
     
     5. Write a Java application where you read several integers from the keypad and verify if they 
     are prime numbers. The number of values is also read from the KB (or command line)
     
02. Operators. Instuctions. Variables
     1. Write a Java application that reads an int value. If the int value is between 1-12, the corresponding string month 
     will be displayed. If the value entered is a string and if it corresponds to a month of the year, display the numeric 
     value of the month.
     
     2. Read a string from the standard input. Turn the string into a character array. Look for in this array a character 
     specified in the program. Display the number of occurrences.
     
     3. Starting from the previous problem, copy the first 3 characters of the array to another array and display the 
     obtained result(use the arraycopy () method from the System class).
     
     4. Write a Java application which defines an integer value and displays it as a binary, octal and hexadecimal string. 
     Write various bases convertion methods. 
     
     5. Implement the already known sorting algorithms (bubble sort, insertion sort, quick sort, etc.) and apply them 
     upon an array of integer variables read from the keyboard.
     
     6. Write a Java program that generates 2 random values and performs some mathematical operations on them.
     
     8. Read from the keyboard the elements of a matrix of integer values with m lines (m taken from the command 
     line). For each line the number of elements will increase by 1 compared to the previous line, the first line having 
     only one element.
     Implement the methods that:
    - display the matrix, line by line and column by column; 
    - eliminate from the matrix (turns into 0) the values that are outside the interval defined by 2 specified limits;
    - display the existent neighbour values of an element identified by its indexes (sent as parameters);
    
    9. Define an array of String variables that will be populated with all the playing cards from a complete package. A 
    series of randomly picked cards will be extracted until the current card will have the clubs sign and a value 
    greater than 8. At each step, the current card and the number of already extracted cards will be displayed.
    Hint: Use a random numbers generator. The cards which were already used are eliminated.
    
03. Java classes, methods, access specifiers
    1. Write a class named Methods having 3 methods: a method with a variable number of integer parameters, which 
    returns the arithmetic mean of the parameters; another method in which will be defined a one-dimensional 
    array of n double-type numbers (n being the parameter of the method and which will be read in main () from 
    the keyboard), its elements will receive randomly generated values and the method will return this array; a 
    static method that receives as a parameter a character array, converts the respective characters into uppercase 
    letters and forms a String object from this array, which wiil be returned by the function. From the main () 
    method, defined in another class, call the methods of the Methods class and display the results on the screen 
    (the call values for the first method and the character string for the 3rd method will be defined in main ()).
    
    2. Define a class X that will have the following attributes: a private array of characters, a protected String object 
    and an integer without access specifier. The class will contain an explicit constructor, which will initialize the 
    attributes, accessor and mutator methods for fields that cannot be accessed outside the class and redefine the 
    finalize () method inherited from the Object class, which will display an appropriate message.
    In the main() method, placed in another class, create an object of X class, display the attribute values, and then 
    prepare the object to be removed by garbage collector. Then create a new X object, change the attribute values, 
    and display their attribute values.
    
    3. Write a Java class that models a matrix of integer values. The dimensions and the array of elements are private 
    attributes and are controlled using appropriate setter-getter methods. Write the methods for displaying the 
    matrix, for determining and returning the number of 9 adjacent elements cells that don’t differ with more than 
    5% from a threshold value.
    
    4. Develop a Java program which defines a class named Person that contains as private attributes: name
    (String), latitude and longitude (float). The class contains an explicit constructor without parameters that 
    will initialize the latitude and longitude with 0 and the string with null. A finalize() method will be used 
    as a destructor from C++ and will display a message. The mutator methods, setName(), setLongitude() and
    setLatitude() will be defined to modify the attributes of the class. Define appropriate accesor methods. 
    Instantiate n objects, read the corresponding data from the keyboard and display the information related to all 
    the objects.
    
    5. Build a Java application that tests the new methods of the String class, introduced in Java11.
   
    6. Define a one-dimensional array of char type, less than a value n introduced from the keyboard. Each value 
    contains some randomly generated alpha-numerical characters. Generate a String object using the array. 
    Display the initial content of the array and after that, process all the elements so that all numbers will be 
    replaced with ‘*’. Display the result.
    
    7. Write an application which defines a class named Child. Define the methods and member variables for this class 
    which enble a Child object to store/do the following:
    - the name of the child
    - the child’s birthday
    - the child can introduce him/herself by „saying”: Hello my name is ...
    - the child can tell his/her age
    - the child can add two numbers smaller than 10 and return the result like so: The sum of X and Y is equal to Z
    - the child knows how to say Goodbye!
    - the child can speak the alphabet both in direct and inverse order
    - the child can color a chess board given its dimensions by using alternative colors (for the colors use the 
    symbols 1 and 0)
    Remarks: the child’s name and birthday cannot be accessed from outside the class.
    All the information about a Child will be filled-in using a Child object and its associated methods and variables. 
    The interaction with teh child will be done through an object which is instantiated in the main method.
    
    8. Write a Java application which defines an authentication key with the format: XXXXX-XXXXX-XXXXX-XXXXX,
    where X is a character which can be either a digit or a letter. The application should verify if this key has exactly 
    4 groups of characters with 5 characters each, and separated by the symbol ‘-‘. Also, compute the number of 
    digits and letters from the authentication key. The number of digits should be greater than the number of 
    letters, and the number of letters cannot be 0. 
    If any of the above conditions are not met, display the message: “Invalid authentication key!”
    
    9. Define a class named Student that has as private attributes the name, tel. number and average mark
    (constructors, setters, getters).
    In the main method create an uni-dimensional array of Student objects with the dimension specified by the user.
    The data corresponding to each object is read from the keyboard, respecting the format name^^^tel. 
    number^^^average mark. If the data specific to the telephone number is not valid (10 numeric characters, with 
    or without special characters like blank, - or .), the user is asked to re-enter the entire array of characters. 
    Display the students ordered by name and by average mark.
    
04. Interfaces, Inheritance, lambda expressions
    1. Consider a Java interface that contains the prototypes of the methods of addition, subtraction, multiplication, 
    division, square root and raising a number to a certain power. All methods will have two double type parameters and 
    specify the returned double type.
    Implement the interface so that operations are defined within a class. Instantiate the class and check the implemented 
    operations.
    
    1’. Instead of an interface that contains all the aforementioned methods, implement 4 functional interfaces, one for 
    each method. The interfaces will be implemented within a single class. Instantiate the class and check the implemented operations.
    
    1’’. Use the structure used at 1’ and implement lambda expressions to define the arithmetic operations. Check the 
    functionality.
    
    2. Define an interface called GeometricForm that contains methods which return the area and perimeter of the 
    geometric form. Implement the interface for: squares, rectangles, circles, equilateral triangles and isosceles triangles. 
    Read from the keyboard N distinct geometric forms specified by their type and specific parameters (for example for a 
    circle, you would need to read its radius). Compute the total area and perimeter of all the geometric forms, taking into 
    account the fact that they do not overlap.    
    
    3. Develop a class hierarchy of shapes and write a program that computes the amount of paint needed to paint different 
    objects. The hierarchy will consist of a parent class Shape with three derived classes - Sphere, Rectangle, and Cylinder. 
    For the purposes of this exercise, the only attribute a shape will have is a name and the method of interest will be one 
    that computes the area of the shape (surface area in the case of three-dimensional shapes). Do the following.
    A. Write an abstract class Shape with the following members:
    - an instance variable shapeName of String type
    - an abstract method area()
    - a toString() method that returns the name of the shape
    B. The file Sphere.java contains the Sphere class which is a descendant of Shape. A sphere has a radius as a private 
    integer variable and implements the body of the inherited abstract method area(). 
    C. Define similar classes for a rectangle and a cylinder. The classes Rectangle and Cylinder are also derived from the 
    Shape class. A rectangle is defined by its length and width. A cylinder is defined by a radius and height.
    Note: Each of the derived classes override the toString method and define specific mutator and accessor methods.
    D. The file Paint.java contains an interface that has a float constant paintPerSurfaceUnit.
    E. The file PaintThings.java implements the Paint interface and contains a program that computes the amount of paint 
    needed to paint various shapes.
    Instantiate the three shape objects: deck <- Rectangle, bigBall <- Sphere and tank <- Cylinder. Make the appropriate 
    method calls to assign each object’s specific attributes with data read from the keyboard.
    Compute the amount of paint needed for covering each created shape.
    
    4. Consider the Fraction class that has two protected attributes a and b for the counter and denominator, two set () and 
    get () methods for each of the class attributes. Define an explicit constructor without parameters that initiates a with 0 
    and b with 1, and an explicit constructor with two parameters that can be called if it is checked whether a fraction can 
    be defined (b! = 0). Define a method simplify () that simplifies and returns a Fraction object by calling the int
    greatestCommonDivider (int, int) method (based on divisions). Define a method for adding two Fraction objects, which 
    returns a Fraction object. Define a ExtendedFraction class derived from Fraction, which will have a constructor with 
    parameters (which calls the constructor from the base class) and which will redefine the method simplify() using an int 
    greatestCommonDivider (int, int) algorithm based on subtractions. Add a method for subtracting two fractions.
    Instantiate two Fraction objects without parameters. Set the attributes of the data objects read from the keyboard. 
    Display the original attributes of the objects and the new defined attributes. Simplify, add and display results. Instantiate 
    two ExtendedFraction objects with data read from the keyboard. Simplify, add and subtract objects and display results.
    Make an upcast from ExtendedFraction to Fraction and try to subtract the items. All operations will be called from the
    main() method.    
    
    5. Define a String Array. Using lambda expressions sort it by the following criteria: length (small->large), inverse length 
    (large->small), alphabetical order, the strings which start with the letter M are first, then come the rest.

05. Java packages, Exceptions handling in Java
    1. Write a Java program that defines an array of double values and read the appropriate data from the keyboard. Handle 
    the exception produced when the code tries to acces an element that has a negative index or an index greater than the 
    maximum number of elements (ArrayIndexOutOfBoundsException). Display a significant message when the exception 
    occurs. 
    Consider a matrix with a fixed number of elements for each line and protect the code against the exception mentioned 
    above. Consider also the case if each line has a different number of elements.
    
    2. Write a Java application which, within the main() method, contains a squence of code that may throw various 
    exceptions, such as ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException, 
    NumberFormatException, as well as others which you consider to be useful for testing. In the catch block show the 
    corresponding message generated by these exceptions. The finally block just prints the message, "I may or may not have 
    caught an exception".
    
    3. Define a package that declares an interface named Int1 (2 integer variables and a sum() method that returns the sum 
    of 2 integer values). Include in the same package a class named Class1 (2 protected double variables, constructor, setters 
    and getters). In another source file, add in the same package a new interface named Int2 (2 double variables and a 
    method named product() that returns the product of 2 double values).
    Implement a distinct source file and import everything from the defined package. Define a class named Class2 that is 
    derived from Class1 and implements both interfaces Int1 and Int2. 
    Instantiate Class2 and call the defined methods for determining the sum and product of some values read from the 
    keyboard.
    
    4. Write a Java class derived from the Exception class, called SuperException. Another class, called SmallerException is 
    derived from SuperException. Within the classes' constructors print a message which indicates which exception was 
    generated. In a third class create a method a() which throws an exception of type SmallerException, and a method b()
    which throws a SuperException.
    In the main() method call these two methods and try to determine the type of exception which occurs, as well as if the 
    corresponding catch block for the SmallerException can catch a SuperException.
    
    5. Write an application which checks if 3 random points form an obtuse triangle. If the condition is not met, a specific 
    exception is thrown: AcuteTriangle, RightTriangle. If the 3 points are on the same line or if the segments determined by 
    the 3 points cannot make up a triangle, throw an ImpossibleTriangle exception, and within the corresponding catch 
    block print a warning and throw a RuntimeException.
    
    6. Write a Java application which implements an exception called OverSaturated. This exception is generated when the 
    saturation of a color has a value over 90 in the HSV color space. Write a method which randomly generated colors in the 
    RGB space and then converts them to the HSB/HSV space (https://www.cs.rit.edu/~ncs/color/t_convert.html). If after 
    the conversion, the color's saturation is over 90, regenerate the color (In the testing phase, use an assertion to verify this 
    internal invariant condition). After 10 consecutive tries to regenerate, throw an exception.
    
    7. Define a Java package named imageProcessor which contains a class called MyImage. The class has all the necessary 
    methods used for initializing and modifying the values from a m x n pixels matrix. Each pixel is an instance of another 
    class named Pixel (also included in the package) which contains 3 integer variables R, G and B with possible values 
    between 0 and 255.
    The class MyImage defines methods for:
    - cancelling the pixels that have the RGB values below some values received as parameters
    - deleting the R G or B components from all the pixels
    - transforming the pixels into grayscale tones by using the formula 0.21 R + 0.71 G + 0.07 B. The new R G and B 
    components will be equal with this formula’s results.
    Note: each operation is timed.
    Import the defined package into a Java application that creates a MyImage instance. The program generates randomly 
    the values for the pixels’ components. Apply the methods stored inside the class upon the created instance. Display the 
    results and the necessary amount of time specific to each operation.
    
    8. Write an application which checks the Romanian vehicle registration numbers. Their format is the following: 
    [L{L}][NN{N}][LLL], where L represents a letter, N a digit, and the curly braces represent the fact that for Bucharest the 
    number is composed of a single letter in the first group, and the digit group can be composed of 3 digits. Implement a 
    method which checks the registration numbers and throw exceptions (instances of specialized exception classes) specific 
    to each error which may occur upon check-up (specialized messages). For example, if the county letters group is 
    composed of 2 letters, the digit group cannot be of size 3. The last letters group cannot contain "I" and "O" on the first 
    and last position.

07. Java Input / Output. Files
    1. Using a KB reading mechanism (BufferedReader/InputStreamReader) input: a message of String type, a day as an 
    integer, a month as a String and a year as an integer variable. The process will end by passing to a new line, or by typing 
    a special String. Separate and display the tokens on different rows. Display all fields extracted from the stream as 
    appeared.
    Recommendation: use the StreamTokenizer class, the attributes sval, nval and the TT_EOL constant.
    Consider the case in which the application is not aware of the entered data type (numbers, words). Use the constants 
    TT_NUMBER, TT_WORD.
    
    2. Implement the previous problem using a file as input source.
    
    3. Read from the keyboard some strings representing dates formated as DD/MM/YYYY. Print the dates as DD month 
    YYYY, where month is the expanded version of the MM, and also display messages if the year is leap. The program exits 
    when the user types in X or x from KB. You may use DateFormatSymbols class for month conversion.
    
    4. You are given a binary file which contains a sequence of characters representing a private Bitcoin key (256 characters). 
    From the keyboard read a sequence of characters which represents the public key for a Bitcoin. Generate the 
    transaction id for this information by using the XOR bitwise operator applied upon the private and public keys. Write the 
    result in another binary file. 

    5. Write a Java application which reads a set of text files that contain students data (CSV files). The files are stored on the 
    local machine under the names Year_Y_Group_XXXX.txt . Agregate the information in these files using a 
    SequenceInputStream and generate a new file which contains all the students ordered alphabetically.
    
    6. You are given a *.csv file which contains the following fields separated by the "/" symbol: name, surname, phone 
    number, date of birth, link to Facebook profile. Read the information in the file and generate individual files containing 
    the following information: people born in December, people whose phone numbers are international (not Romanian) or 
    are landline numbers, people named Andrei and Nicolae and people whose Facebook profile link is not customised (have 
    a random sequence of digits at the end of the link).

    7. Write a Java application which enables the serialization and deserialization of objects that represent arrays of int
    values. Populate an object with keyboard entered data, order the values and store the object in a file. Read the file and 
    display the reconstructed array of values.
    
08. Java multithreading
    1. Write a Java application which contains a class which implements the Runnable interface. The class' constructor sets 
    the name of the instantiated object. Also, there is a class variable which counts the number of instantiated objects from 
    that class. The run( ) method of the class will print the object's name for a number of times equal to the counter's value, 
    each printing being delayed 1000 msec. 
    In a distinct class, create multiple threads built from separate objects of the previously described class. Analyze the 
    results.

    2. Write a Java application with a thread that generates 30 random numbers between 0 and 30. Another thread displays 
    the area of the circles having as radiuses the values divisible by 3 generated by the first thread. 

    3. Write a class for determining a certain value from Fibonacci’s array. The class has 2 methods, one for calculating and 
    the other for displaying the desired value. Use a synchronized multithreading mechanism in which one process displays 
    all the Fibonacci numbers smaller than the desired value computed by the other process.

    4. Write a Java app which uses the synchronized method acces for mutual exclusion. Create 3 separate threads which 
    simultaneously call methods to increment and decrement a separate class' class variable. Check if the results are what 
    you expect them to be. Remove the synchronized blocks and reevaluate the results.    

    5. Write a Java app which computes the greatest common divisor for large numbers (>100.000). The app will continuosly 
    read from the keyboard pairs of numbers and launch threads for each of the pairs. The results will be displayed in the 
    console as soon as they are available.
    
    6. Write a Java application with a thread that writes some information into a file while another thread reads the written 
    data and displays it on the screen. Synchronize the threads.
    
09. Java graphical applications
    1. Write a Frame application that will display in a panel your name and group. The text will be blue and centered both on 
    the horizontal and vertical, given the dimension of the panel.

    2. Write a Frame application that will draw, inside a Canvas component, a circle tangent to smaller side of the canvas.
    
    3. Write a Frame application that displays an image stored in a local file. Below the image display the filename with a 
    predefined Font. The text is drawn using a color composed of 3 predefined components (red, green, blue).

    4. Write a Frame application that displays a TV test card. The card will contain at least 10 levels of grey and the basic 
    colors red, green, blue, yellow, cyan and magenta. The card will cover the entire surface of the component that displays 
    it (Canvas, etc.).
    
    5. Write a Frame application that draws a circle colored in all the possible colors. The starting color is red and the color 
    transitions must be made as smooth as possible.

    6. Write a Frame application that draws a schematic car. Use different colors for different car parts (doors, wheels, etc.).
    
    7. Implement a Frame application that fills a visual container with circles having randomly generated radii. The circles 
    are tangent and have random colors.    
    
10. Components used in Graphical User Interfaces
    1. Implement a Java application that uses GridLayout for arranging the components specific to a computing application. 
    (TextField for I/O operations, buttons for numbers, mathematical operations, screen cleaning, etc.).
    
    2. Implement a Java application that uses GridBagLayout for arranging the components specific to a computing 
    application. (TextField for I/O operations, buttons for numbers, mathematical operations, screen cleaning, etc.).
    
    3. Implement a TabbedView Java application that displays in each graphical panel:
    - a drawing area
    - the necessary components for selecting a font type, size and color
    - the necessary components for choosing a geometrical shape (from a predefined set) and a size for the side / radius (as 
    the case).

    4. Create an application which takes from two text fields your name and the group you are part of and displays this info 
    in a label colored in RGB (122,123,129).
    
    5. Implement a graphical application that displays 3 TextField components for setting the amounts of R, G and B from a 
    color. After pressing a button, a Label component will display a text representing the specified quantities, with the 
    resulting color, if the values are correct (numerical, between 0-255). Oherwise, an error message will be displayed with 
    red. Try to use exceptions for validating the input.
    
    6. Write a Java application which includes a sign-up form for an online course. The form includes information regarding 
    the name, surname, year of study, faculty, financing (tax/budget) and the course. The year of study, faculty and course 
    are drop-down lists, and the financing is a check-box field. În a TextArea field print the filled-in information after the 
    Sign-up button is pressed.    
