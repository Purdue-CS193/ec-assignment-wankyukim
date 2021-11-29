# CS 193 EC - Assignment for CS 182

## What is this assignment?

CS 182 covers covers a wide range of topics ranging from logic and proofs to probability and beyond. The goal of this assignment is to provide you a sense of what to expect going into CS 182 as you transition into your second semester. We will primarily focus on what you will see and learn in your first few weeks in the course, that will be beneficial to you later in the semester.

In this assignment, you will learn how to construct truth tables and prove logical equivalences using a truth table. As well as using LaTeX to help organize/format your answers.

## Basic Propositional Logic

### What are propositions?
Propositions are declarative statements that declares a fact, that can be either true or false, but not both. <br>
Examples of propositions: <br>
&nbsp;&nbsp;&nbsp;1. The Big 10 Conference is the oldest Division I collegiate athletic conference in the United States, consisting of 14 colleges.  
&nbsp;&nbsp;&nbsp;2. 1 + 1 = window.  
&nbsp;&nbsp;&nbsp;3. Toronto is the provincial capital of Ontario, and the largest city in Canada.  

Propositions 1 and 3 are true, whereas 2 is false. <br>

Here are some sentences/statements that are not propositions: <br>
&nbsp;&nbsp;&nbsp;1. REaD tHIs SEnTeNcE cArEFulLy.  
&nbsp;&nbsp;&nbsp;2. x + y = z. 

Sentence 1 is not a proposition because it is not a declarative sentence. Sentence 2 is neither true nor false.

### Logical Connectives

#### Negation (NOT) ¬
The *negation* of a proposition *p* is ¬p. It negates the truth value of the proposition as shown: <br>

![Negation](https://github.com/Purdue-CS193/EC-assignment/blob/master/images/Negation.png)

#### Conjunction (AND) ∧
The *conjunction* of propositions *p* and *q* is *p* ∧ *q*. Only when *p* and *q* are true will the truth value of *p* ∧ *q* is true as shown: <br>

![Conjunction](https://github.com/Purdue-CS193/EC-assignment/blob/master/images/Conjunction.png)

#### Disjunction (OR) ∨
The *disjunction* of propositions *p* and *q* is *p* ∨ *q*. The truth values for this are always true whenever p or q are true as shown: <br>

![Disjunction](https://github.com/Purdue-CS193/EC-assignment/blob/master/images/Disjunction.png)

#### Implication &#8594;
The *implication* of propositions *p* and *q* is *p* &#8594; (implies) *q*. *p* is called the hypothesis (or premise) and *q* is called the conclusion (or consequence). The truth values for this is always true except when your hypothesis (*p*) is true, but your conclusion (*q*) is false as shown: <br> 

![Implication](https://github.com/Purdue-CS193/EC-assignment/blob/master/images/Implication.png) <br>

Consider this example: <br>
If you score above a 95% on this exam, then you will get an A in a class. <br>

In this statement, you are guaranteed an A if you score above 95% on the exam. The statement is true if you scored 100%. However, if you scored above 95% and didn't get an A, then the promise is broken and the statement is false. The statement doesn't say anything about if you scored below 95%, so the value is still true because the hypothesis wasn't satisfied. 

#### Biconditional &#11020;
The biconditional of propositions *p* and *q* is *p* &#11020; (if and only if) *q*. The truth values are shown: <br>


![Biconditional](https://github.com/Purdue-CS193/EC-assignment/blob/master/images/Biconditional.png) <br>

Consider this example: <br>
You are eligible to vote in a United States election **if and only if** you are a United States citizen, 18 years or older, and not a convicted felon. <br>

This statement is also true if stated: <br>
You are a United States citizen, 18 years or older, and not a convicted felon **if and only if** you are eligible to vote in a United States election. <br>

A biconditional statement is also logically equivalent to saying *p implies q* and *q implies p*. In order to prove biconditional statements, you would need to prove both implications. 

## Interested in Exploring or Learning More about Discrete Math?
Here's a useful [resource](https://trevtutorvideos.wordpress.com/discretemath/) that I (Cindy) found beneficial while taking CS 182.  
