# Build your Shop - Clothing Store Point of Sale System 
This project is a fully functional **Point of Sale (POS) system** for a small clothing store. Developed in Java as part of coursework for **ITSC 1212 - Introduction to Computer Science II** at the **University of North Carolina at Charlotte**, this application simulates a realistic shopping experience with item selection, order creation, customer and store details, and final receipt generation. 
## Project Overview 
This console-based Java application allows two users (shop owner and customer) to interact through a POS system interface. The program captures user input, processes item selection, validates input against a dynamic product menu, and displays a detailed receipt including tax, date, and time. 
## Features 
- **Customer Interaction**
  - Greets user with store name, banner, and owner's introduction
  - Collects customer details to instantiate a `Customer` object
- **Menu Display & Item Selection**
  - At least **10 clothing items** with names, prices, and IDs
  - Users select items by ID, validated through input checks
  - Includes a `"00 - No Item"` option for flexibility
  - Allows order cancellation with `"x"` as an exit command
- **Order & Receipt**
  - Accepts item selection input, stores in an array
  - Computes subtotal, tax (7.5%) and total
  - Displays date/time and outputs a professional receipt
  - Implements a clean `toString()` method for easy printing
## Acknowledgments 
Project developed for: 
- **ITSC 1212 - Introduction to Computer Science I**
- Professor: D.I. Von Briesen
- University of North Carolina at Charlotte
  
© 2025 Samuel Ramdial

