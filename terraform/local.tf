
resource local_file name {
  filename = "output.txt"
  content = var.my_content    
}


variable "my_content" {
  type=string
 # default = "Hello world"
}
