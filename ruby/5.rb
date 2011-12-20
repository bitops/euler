# Solution to problem 5
n = 1
while true do
	result = (1..20).map {|i| n % i }.reduce(:+)
	if result == 0
		break
	else
	  n = n + 1
	end
end
puts "Answer found."
puts "n: #{n}"
