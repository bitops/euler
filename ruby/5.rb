# technically, this implementation should work, but I should haven't found a way to 
# get it to complete in any reasonable amount of time. that is, ever. :)
puts "Starting."
n = 1
while true do
	puts "Testing #{n}"
	result = (1..20).map {|i| n % i }.reduce(:+)
	if result == 0
		break
	else
	  n = n + 1
	end
end
puts "Answer found."
puts "n: #{n}"
