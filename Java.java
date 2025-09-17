import java.util.Scanner;
class Demo
{
	Scanner sr = new Scanner(System.in);
	int id;
	String name;
	double price;
	String brand;
	String color;
	String size;
	int unit;
	int i;
	int j;
	int k;
	int l;
	int m = 0;
	int sum;
	int r;
	String filter[] = new String[5];
	Demo[] setAuto(Demo a[])
	{
		a[0].id = 1;
		a[0].name = "Tshirt"; 
		a[0].price = 3500;
		a[0].brand = "Adidas";
		a[0].color = "Red";
		a[0].size = "L";
		a[0].unit = 98;
		a[1].id = 2;
		a[1].name = "Track"; 
		a[1].price = 2490;
		a[1].brand = "Puma";
		a[1].color = "Black";
		a[1].size = "S";
		a[1].unit = 88;
		a[2].id = 3;
		a[2].name = "Shirt"; 
		a[2].price = 950;
		a[2].brand = "Gucci";
		a[2].color = "Blue";
		a[2].size = "M";
		a[2].unit = 56;
		a[3].id = 4;
		a[3].name = "Jacket"; 
		a[3].price = 7600;
		a[3].brand = "Nike";
		a[3].color = "Red";
		a[3].size = "M";
		a[3].unit = 56;
		j = 4;
		return a;
	}
	Demo[] set(Demo a[])
	{
		for(i=0;i<2;i++)
		{
			System.out.println("Enter details of product "+(i+1));
			System.out.println();
			System.out.print("Enter product id : ");
			a[i].id = sr.nextInt();
			System.out.print("Enter product name : ");
			a[i].name = sr.next();
			System.out.print("Enter product price : ");
			a[i].price = sr.nextDouble();
			System.out.print("Enter product brand : ");
			a[i].brand = sr.next();
			System.out.print("Enter product color : ");
			a[i].color = sr.next();
			System.out.print("Enter product size : ");
			a[i].size = sr.next();
			System.out.print("Enter product units : ");
			a[i].unit = sr.nextInt();
			System.out.println();
		}
		j = 2;
		return a;
	}
	Demo[] addProduct(Demo a[])
	{
		System.out.print("Enter product id : ");
		a[j].id = sr.nextInt();
		System.out.print("Enter product name : ");
		a[j].name = sr.next();
		System.out.print("Enter product price : ");
		a[j].price = sr.nextDouble();
		System.out.print("Enter product brand : ");
		a[j].brand = sr.next();
		System.out.print("Enter product color : ");
		a[j].color = sr.next();
		System.out.print("Enter product size : ");
		a[j].size = sr.next();
		System.out.print("Enter product units : ");
		a[j].unit = sr.nextInt();
		System.out.println();
		System.out.println("Product added succesfully");
		System.out.println();
		j = j + 1;
		return a;
	}
	Demo[] removeProduct(Demo a[])
	{
		System.out.print("Enter product id : ");
		int id = sr.nextInt();
		for(i=0;i<j;i++)
		{
			if(a[i].id==id)
			{
				for(k=i;k<j;k++)
				{
					a[k] = a[k+1];
				}
				j = j - 1;
				System.out.println();
				System.out.println("Product remove succesfully");
				System.out.println();
				return a;
			}
		}
		System.out.println();
		System.out.println("Product not found");
		System.out.println();
		return a;
	}
	Demo[] updateProduct(Demo a[])
	{
		System.out.print("Enter product id : ");
		int id = sr.nextInt();
		System.out.println();
		for(i=0;i<j;i++)
		{
			if(a[i].id==id)
			{
				while(true)
				{
					System.out.println("Press 1 to update price");
					System.out.println("Press 2 to update unit");
					System.out.println("Press 3 to exit");
					int b = sr.nextInt();
					System.out.println();
					if(b==3)
					{
						break;
					}
					switch(b)
					{
						case 1:
						System.out.print("Enter product price : ");
						a[i].price = sr.nextDouble();
						System.out.println();
						System.out.println("Product price updated succesfully");
						System.out.println();
						break;
						case 2:
						System.out.print("Enter product units : ");
						a[i].unit = sr.nextInt();
						System.out.println();
						System.out.println("Product unit updated succesfully");
						System.out.println();
						break;
						default:
						System.out.println("Invalid input");
						System.out.println();
						break;
					}
				}
				return a;
			}
		}
		System.out.println("Product not found");
		System.out.println();
		return a;
	}
	void filter()
	{
		boolean flag = true;
		boolean flag1 = true;
		while(flag)
		{
			System.out.println("Filters :");
			System.out.println();
			System.out.println("1. price");
			System.out.println("2. Brand");
			System.out.println("3. Color");
			System.out.println("4. Size");
			System.out.println("5. units");
			int b = sr.nextInt();
			System.out.println();
			switch(b)
			{
				case 1:
				while(flag1)
				{
					System.out.println("1. below 1000");
					System.out.println("2. 1000-5000");
					System.out.println("3. above 5000");
					int c = sr.nextInt();
					System.out.println();
					flag = false;
					switch(c)
					{
						case 1:
						filter[0] = "1";
						flag1 = false;
						break;
						case 2:
						filter[0] = "2";
						flag1 = false;
						break;
						case 3:
						filter[0] = "3";
						flag1 = false;
						break;
						default:
						System.out.println("Invalid input");
						System.out.println();
						break;
					}
				}
				break;
				case 2:
				System.out.print("Enter brand : ");
				String brand = sr.next();
				System.out.println();
				filter[1] = brand;
				flag = false;
				break;
				case 3:
				System.out.print("Enter color : ");
				String color = sr.next();
				System.out.println();
				filter[2] = color;
				flag = false;
				break;
				case 4:
				System.out.print("Enter size : ");
				String size = sr.next();
				System.out.println();
				filter[3] = size;
				flag = false;
				break;
				case 5:
				boolean flag2 = true;
				while(flag2)
				{
					System.out.println("1. below 50");
					System.out.println("2. between 50-100");
					System.out.println("3. above 100");
					int c = sr.nextInt();
					System.out.println();
					flag = false;
					switch(c)
					{
						case 1:
						filter[4] = "1";
						flag2 = false;
						break;
						case 2:
						filter[4] = "2";
						flag2 = false;
						break;
						case 3:
						filter[4] = "3";
						flag2 = false;
						break;
						default:
						System.out.println("Invalid input");
						System.out.println();
						break;
					}
				}
				break;
				default:
				System.out.println("Invalid input");
				System.out.println();
				break;
			}
		}
		boolean flag2 = true;
		while(flag2)
		{
			System.out.println("Do you want to add another filter ?");
			System.out.println();
			System.out.println("1. Yes");
			System.out.println("2. No");
			int b1 = sr.nextInt();
			System.out.println();
			switch(b1)
			{
				case 1:
				filter();
				case 2:
				flag2 = false;
				break;
				default:
				System.out.println("Invalid input");
				System.out.println();
				break;
			}
		}
	}
	void make(String a[])
	{
		sum = 0;
		m = 0;
		for(i=0;i<5;i++)
		{
			if(a[i]!=null)
			{
				sum = sum + ((i + 1) * (int) Math.pow(10,m));
				m++; 
			}
		}
		System.out.println(sum);
	}
	void searchProduct(Demo a[])
	{
		boolean flag3 = true;
		l = 1;
		r = sum % 10;
		sum = sum / 10;
		switch(r)
		{
			case 1:
			if("1".compareToIgnoreCase(filter[0])==0)
			{
				for(i=0;i<j;i++)
				{
					if(a[i].price<1000)
					{
						if(sum==0)
						{
							System.out.println((l++)+". Product Details");
							System.out.println();
							showProduct(a,i);
							flag3 = false;
						}
						else
						{
							while(sum>0)
							{
								r = sum % 10;
								sum = sum / 10;
								switch(r)
								{
									case 2:
									if((a[i].brand).compareToIgnoreCase(filter[1])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
									case 3:
									if((a[i].color).compareToIgnoreCase(filter[2])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
									case 4:
									if((a[i].size).compareToIgnoreCase(filter[3])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
								}
							}
						}
					}
				}
			}
			else if("2".compareToIgnoreCase(filter[0])==0)
			{
				for(i=0;i<j;i++)
				{
					if(a[i].price>=1000&&a[i].price<=5000)
					{
						if(sum==0)
						{
							System.out.println((l++)+". Product Details");
							System.out.println();
							showProduct(a,i);
							flag3 = false;
						}
						else
						{
							while(sum>0)
							{
								r = sum % 10;
								sum = sum / 10;
								switch(r)
								{
									case 2:
									if((a[i].brand).compareToIgnoreCase(filter[1])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
									case 3:
									if((a[i].color).compareToIgnoreCase(filter[2])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
									case 4:
									if((a[i].size).compareToIgnoreCase(filter[3])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
								}
							}
						}
					}
				}
			}
			else
			{
				for(i=0;i<j;i++)
				{
					if(a[i].price>5000)
					{
						if(sum==0)
						{
							System.out.println((l++)+". Product Details");
							System.out.println();
							showProduct(a,i);
							flag3 = false;
						}
						else
						{
							while(sum>0)
							{
								r = sum % 10;
								sum = sum / 10;
								switch(r)
								{
									case 2:
									if((a[i].brand).compareToIgnoreCase(filter[1])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
									case 3:
									if((a[i].color).compareToIgnoreCase(filter[2])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
									case 4:
									if((a[i].size).compareToIgnoreCase(filter[3])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
								}
							}
						}
					}
				}
			}
			if(flag3)
			{
				System.out.println("Product not found");
				System.out.println();
			}
			break;
			case 2:
			for(i=0;i<j;i++)
			{
				if((a[i].brand).compareToIgnoreCase(filter[1])==0)
				{
					if(sum==0)
					{
						System.out.println((l++)+". Product Details");
						System.out.println();
						showProduct(a,i);
						flag3 = false;
					}
					else
					{
						while(sum>0)
						{
							r = sum % 10;
							sum = sum / 10;
							switch(r)
							{
								case 1:
								break;
								case 3:
								if((a[i].color).compareToIgnoreCase(filter[2])==0)
								{
									if(sum==0)
									{
										System.out.println((l++)+". Product Details");
										System.out.println();
										showProduct(a,i);
										flag3 = false;
									}
								}
								break;
								case 4:
								if((a[i].size).compareToIgnoreCase(filter[3])==0)
								{
									if(sum==0)
									{
										System.out.println((l++)+". Product Details");
										System.out.println();
										showProduct(a,i);
										flag3 = false;
									}
								}
								break;
							}
						}
					}
				}
			}
			if(flag3)
			{
				System.out.println("Product not found");
				System.out.println();
			}
			break;
			case 3:
			for(i=0;i<j;i++)
			{
				if((a[i].color).compareToIgnoreCase(filter[2])==0)
				{
					if(sum==0)
					{
						System.out.println((l++)+". Product Details");
						System.out.println();
						showProduct(a,i);
						flag3 = false;
					}
					else
					{
						while(sum>0)
						{
							r = sum % 10;
							sum = sum / 10;
							switch(r)
							{
								case 1:
								break;
								case 2:
								if((a[i].brand).compareToIgnoreCase(filter[1])==0)
								{
									if(sum==0)
									{
										System.out.println((l++)+". Product Details");
										System.out.println();
										showProduct(a,i);
										flag3 = false;
									}
								}
								break;
								case 4:
								if((a[i].size).compareToIgnoreCase(filter[3])==0)
								{
									if(sum==0)
									{
										System.out.println((l++)+". Product Details");
										System.out.println();
										showProduct(a,i);
										flag3 = false;
									}
								}
								break;
							}
						}
					}
				}
			}
			if(flag3)
			{
				System.out.println("Product not found");
				System.out.println();
			}
			break;
			case 4:
			for(i=0;i<j;i++)
			{
				if((a[i].size).compareToIgnoreCase(filter[3])==0)
				{
					if(sum==0)
					{
						System.out.println((l++)+". Product Details");
						System.out.println();
						showProduct(a,i);
						flag3 = false;
					}
					else
					{
						while(sum>0)
						{
							r = sum % 10;
							sum = sum / 10;
							switch(r)
							{
								case 1:
								break;
								case 2:
								if((a[i].brand).compareToIgnoreCase(filter[1])==0)
								{
									if(sum==0)
									{
										System.out.println((l++)+". Product Details");
										System.out.println();
										showProduct(a,i);
										flag3 = false;
									}
								}
								break;
								case 3:
								if((a[i].color).compareToIgnoreCase(filter[2])==0)
								{
									if(sum==0)
									{
										System.out.println((l++)+". Product Details");
										System.out.println();
										showProduct(a,i);
										flag3 = false;
									}
								}
								break;
							}
						}
					}
				}
			}
			if(flag3)
			{
				System.out.println("Product not found");
				System.out.println();
			}
			break;
			case 5:
			if("1".compareToIgnoreCase(filter[4])==0)
			{
				for(i=0;i<j;i++)
				{
					if(a[i].unit<50)
					{
						if(sum==0)
						{
							System.out.println((l++)+". Product Details");
							System.out.println();
							showProduct(a,i);
							flag3 = false;
						}
						else
						{
							while(sum>0)
							{
								r = sum % 10;
								sum = sum / 10;
								switch(r)
								{
									case 2:
									if((a[i].brand).compareToIgnoreCase(filter[1])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
									case 3:
									if((a[i].color).compareToIgnoreCase(filter[2])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
									case 4:
									if((a[i].size).compareToIgnoreCase(filter[3])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
								}
							}
						}
					}
				}
			}
			else if("2".compareToIgnoreCase(filter[4])==0)
			{
				for(i=0;i<j;i++)
				{
					if(a[i].unit>=50&&a[i].unit<=100)
					{
						if(sum==0)
						{
							System.out.println((l++)+". Product Details");
							System.out.println();
							showProduct(a,i);
							flag3 = false;
						}
						else
						{
							while(sum>0)
							{
								r = sum % 10;
								sum = sum / 10;
								switch(r)
								{
									case 2:
									if((a[i].brand).compareToIgnoreCase(filter[1])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
									case 3:
									if((a[i].color).compareToIgnoreCase(filter[2])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
									case 4:
									if((a[i].size).compareToIgnoreCase(filter[3])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
								}
							}
						}
					}
				}
			}
			else
			{
				for(i=0;i<j;i++)
				{
					if(a[i].unit>100)
					{
						if(sum==0)
						{
							System.out.println((l++)+". Product Details");
							System.out.println();
							showProduct(a,i);
							flag3 = false;
						}
						else
						{
							while(sum>0)
							{
								r = sum % 10;
								sum = sum / 10;
								switch(r)
								{
									case 2:
									if((a[i].brand).compareToIgnoreCase(filter[1])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
									case 3:
									if((a[i].color).compareToIgnoreCase(filter[2])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
									case 4:
									if((a[i].size).compareToIgnoreCase(filter[3])==0)
									{
										if(sum==0)
										{
											System.out.println((l++)+". Product Details");
											System.out.println();
											showProduct(a,i);
											flag3 = false;
										}
									}
									break;
								}
							}
						}
					}
				}
			}
			if(flag3)
			{
				System.out.println("Product not found");
				System.out.println();
			}
			break;
		}
	}
	void showProduct(Demo a[],int i)
	{
		System.out.println("Id : "+a[i].id);
		System.out.println("Name : "+a[i].name);
		System.out.println("Price : "+a[i].price);
		System.out.println("Brand : "+a[i].brand);
		System.out.println("Color : "+a[i].color);
		System.out.println("Size : "+a[i].size);
		System.out.println("Unit : "+a[i].unit);
		System.out.println();
	}
}
class Java
{
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);
		Demo d = new Demo();
		Demo d1[] = new Demo[100];
		int i;
		boolean flag;
		boolean flag5 = true;
		for(i=0;i<100;i++)
		{
			d1[i] = new Demo();
		}
		System.out.println();
		System.out.println("-----WELCOME TO CLOTHES INVENTORY-----");
		System.out.println();
		while(true)
		{
			System.out.println("Press 1 to set product");
			System.out.println("Press 2 to add product");
			System.out.println("Press 3 to remove product");
			System.out.println("Press 4 to update product");
			System.out.println("Press 5 to search product by filters");
			System.out.println("Press 6 to see product");
			System.out.println("Press 7 to see all products");
			System.out.println("Press 8 to exit");
			int a = sr.nextInt();
			if(a==8)
			{
				break;
			}
			switch(a)
			{
				case 1:
				System.out.println();
				while(true)
				{
					System.out.println("Press 1 to set product automatically");
					System.out.println("Press 2 to set product manually");
					int b = sr.nextInt();
					System.out.println();
					if(b==1)
					{
						d1 = d.setAuto(d1);
						break;
					}
					else if(b==2)
					{
						d1 = d.set(d1);
						break;
					}
					else
					{
						System.out.println("Invalid input");
						System.out.println();
					}
				}
				break;
				case 2:
				System.out.println();
				d1 = d.addProduct(d1);
				break;
				case 3:
				System.out.println();
				d1 = d.removeProduct(d1);
				break;
				case 4:
				System.out.println();
				d1 = d.updateProduct(d1);
				break;
				case 5:
				System.out.println();
				d.filter();
				d.make(d.filter);
				d.searchProduct(d1);
				break;
				case 6:
				System.out.println();
				System.out.print("Enter product id : ");
				int id = sr.nextInt();
				System.out.println();
				flag = true;
				for(i=0;i<d.j;i++)
				{
					if(d1[i].id==id)
					{
						System.out.println("Product Details");
						System.out.println();
						d.showProduct(d1,i);
						flag = false;
						break;
					}	
				}
				if(flag)
				{
					System.out.println("Product not found");
					System.out.println();
				}
				break;
				case 7:
				System.out.println();
				for(i=0;i<d.j;i++)
				{
					System.out.println(i+1+". Product details");
					System.out.println();
					d.showProduct(d1,i);
				}
				break;
				default:
				System.out.println();
				System.out.println("Invalid input");
				System.out.println();
				break;
			}
		}
	}
}