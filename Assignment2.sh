while true; do
    echo "Enter a number [0 to Terminate] "
    read number

    #check if input is 0 to exit loop
    if [ "$number" -eq 0 ]; then
        echo "Terminated"
        break
    fi
    #check even or odd
    if [ $((number % 2)) -eq 0 ]; then
        echo "$number is even"
    else
        echo "$number is odd"
    fi
done