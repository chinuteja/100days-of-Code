class Node:
	def __init__(self,data):
		self.data = data
		self.next = None
class LinkedList:
	size = 0
	def __init__(self):
		self.head = None
	def pushAtBegining(self,new_data):
		new_node = Node(new_data)
		new_node.next = self.head
		self.head = new_node
		self.size += 1
	def pushAtTail(self,new_data):
		new_node = Node(new_data)
		if self.head == None:
			self.head = new_node
			self.size += 1
		else:
			temp = self.head
			while(temp.next):
				temp = temp.next
			temp.next = new_node
			self.size += 1
	def popLeft(self):
		if self.head == None:
			print("LinkedList is empty")
			return
		else:
			info = self.head.data
			self.head = self.head.next
			self.size -= 1
			return info
	def popRight(self):
		temp = self.head
		if temp == None:
			print("LinkedList is empty")
		elif(self.size < 2):
			info = self.head.data
			self.head = None
			self.size -= 1
			return info
		else:
			while(temp.next.next != None):
				# print("inside whi")
				temp = temp.next
			info = temp.next.data
			temp.next = None
			self.size -= 1
			# print("info ",info)
			return info
	def show(self):
		temp = self.head
		if temp == None:
			print("LinkedList is empty")
		else:
			string = "{"
			while(temp.next != None):
				string += str(temp.data) + " "
				temp = temp.next
			string += str(temp.data)+ "}"
			print(string)
	def size1(self):
		return self.size

def main():
	linkedlist = LinkedList()
	# linkedlist.pushAtTail(60)
	linkedlist.pushAtBegining(10)
	linkedlist.pushAtBegining(20)
	linkedlist.pushAtBegining(30)
	# linkedlist.pushAtTail(40)
	# linkedlist.pushAtTail(50)
	linkedlist.show()
	# print(linkedlist.popLeft())
	print(linkedlist.popRight())
	
	linkedlist.show()
if __name__ == '__main__':
	main()
