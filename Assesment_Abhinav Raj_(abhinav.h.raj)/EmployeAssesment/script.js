document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('employee-form');
    const employeeTable = document.getElementById('employee-table').getElementsByTagName('tbody')[0];

    form.addEventListener('submit', (e) => {
        e.preventDefault();

        const name = document.getElementById('name').value;
        const email = document.getElementById('email').value;
        const department = document.getElementById('department').value;
        const role = document.getElementById('role').value;

        // Validate email format
        if (!isValidEmail(email)) {
            alert('Please enter a valid email address.');
            return;
        }

        // Add new employee to the table
        const newRow = employeeTable.insertRow();
        const cellName = newRow.insertCell(0);
        const cellEmail = newRow.insertCell(1);
        const cellDepartment = newRow.insertCell(2);
        const cellRole = newRow.insertCell(3);

        cellName.textContent = name;
        cellEmail.textContent = email;
        cellDepartment.textContent = department;
        cellRole.textContent = role;

        // Clear form fields
        form.reset();
    });

    // Function to validate email format
    function isValidEmail(email) {
        const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return regex.test(email);
    }
});
