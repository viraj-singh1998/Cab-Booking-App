# Cab-Booking-App
Desktop app for a user to book cabs randomized over a set of given locations, carry out wallet transactions, etc.
Users start by creating a account and adding money to it.
Following that, the user's location and intended destination is provided to the app and the nearest idle (drivers with a status of 0 in the Drivers table) driver and a fare and ETA estimate is provided, awaiting user confirmation to book.
Next the user and driver statuses are set to in-trip (status attributes of the records of the corresponding user and driver are set to 1 in their respective tables).
After the completion of the trip, the fare is deducted from the user's wallet and and both the user and driver's statuses are reset to idle (0).
A random distribution of drivers takes place at regular intervals (10 seconds) so simulate real-world randomness.
