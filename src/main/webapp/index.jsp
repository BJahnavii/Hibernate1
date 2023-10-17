<!DOCTYPE html>
<html>
<head>
<title>Cart</title>
</head>
<body>
	<center>
		<h1>Cart</h1>
		<table border="1">
			<tr>
				<th>Product</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Subtotal</th>
				<th>Action</th>
			</tr>
			<tr>
				<td>Product 1</td>
				<td>$10.00</td>
				<td><input type="number" name="quantity" value="1"></td>
				<td>$10.00</td>
				<td>
					<button>Add</button>
					<button>Update</button>
					<button>Cancel</button>
				</td>
			</tr>
			<tr>
				<td>Product 2</td>
				<td>$15.00</td>
				<td><input type="number" name="quantity" value="1"></td>
				<td>$15.00</td>
				<td>
					<button>Add</button>
					<button>Update</button>
					<button>Cancel</button>
				</td>
			</tr>



		</table>



		<br> <label for="coupon">Coupon Code:</label> <input type="text"
			id="coupon" name="coupon">
		<button>Apply Coupon</button>



		<!-- Total -->
		<p>Total: $25.00</p>
	</center>
</body>
</html>