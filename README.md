Charity Management System

Base URL: http://localhost:8080/api/

📌 Table of Contents

Charity API

Donation API

Donor API

🏢 Charity API

➕ Add a Charity

POST /charities

Description: Adds a new charity.

🔹 Request Body (JSON):

{
  "name": "Charity Name",
  "description": "Description of the charity",
  "address": "Charity Address"
}

🔹 Response:

200 OK – "Charity added successfully!"

400 BAD REQUEST – "Error: validation message"

📜 Get All Charities

GET /charities

Description: Retrieves a list of all charities.

🔹 Response:

[
  {
    "id": 1,
    "name": "Charity 1",
    "description": "Helping communities",
    "address": "123 Street"
  }
]

🔍 Get Charity by ID

GET /charities/{id}

Description: Retrieves details of a specific charity by ID.

🔹 Example Request:

GET /charities/1

🔹 Response:

{
  "id": 1,
  "name": "Charity 1",
  "description": "Helping communities",
  "address": "123 Street"
}

404 NOT FOUND – if the charity is not found.

✏ Update Charity

PUT /charities/{id}

Description: Updates details of an existing charity.

🔹 Request Body (JSON):

{
  "name": "Updated Charity Name",
  "description": "Updated description",
  "address": "Updated Address"
}

🔹 Response:

200 OK – "Charity updated successfully!"

404 NOT FOUND – "Charity not found!"

❌ Delete Charity

DELETE /charities/{id}

Description: Deletes a charity by ID.

🔹 Example Request:

DELETE /charities/1

🔹 Response:

200 OK – "Charity deleted successfully!"

404 NOT FOUND – "Charity not found!"

💸 Donation API

➕ Add a Donation

POST /donations

Description: Adds a new donation.

🔹 Request Body (JSON):

{
  "amount": 100,
  "charityId": 1,
  "donorId": 1
}

🔹 Response:

200 OK – "Donation added successfully!"

400 BAD REQUEST – "Error: validation message"

📜 Get All Donations

GET /donations

Description: Retrieves a list of all donations.

🔹 Response:

[
  {
    "id": 1,
    "amount": 100,
    "charityId": 1,
    "donorId": 1
  }
]

🔍 Get Donation by ID

GET /donations/{id}

Description: Retrieves details of a specific donation by ID.

🔹 Example Request:

GET /donations/1

🔹 Response:

{
  "id": 1,
  "amount": 100,
  "charityId": 1,
  "donorId": 1
}

404 NOT FOUND – if the donation is not found.

👤 Donor API

➕ Add a Donor

POST /donors

Description: Adds a new donor.

🔹 Request Body (JSON):

{
  "name": "John Doe",
  "email": "johndoe@example.com"
}

🔹 Response:

200 OK – "Donor added successfully!"

400 BAD REQUEST – "Error: validation message"

📜 Get All Donors

GET /donors

Description: Retrieves a list of all donors.

🔹 Response:

[
  {
    "id": 1,
    "name": "John Doe",
    "email": "johndoe@example.com"
  }
]

🔍 Get Donor by ID

GET /donors/{id}

Description: Retrieves details of a specific donor by ID.

🔹 Example Request:

GET /donors/1

🔹 Response:

{
  "id": 1,
  "name": "John Doe",
  "email": "johndoe@example.com"
}

404 NOT FOUND – if the donor is not found.

❌ Delete Donor

DELETE /donors/{id}

Description: Deletes a donor by ID.

🔹 Example Request:

DELETE /donors/1

🔹 Response:

200 OK – "Donor deleted successfully!"

404 NOT FOUND – "Donor not found!"

✅ Conclusion

📌 This API manages charities, donations, and donors.
📌 Use JSON for POST and PUT requests.
📌 All server responses are in JSON format.

