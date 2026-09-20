 ### Added
- User and Admin role-based access
- BCrypt password hashing
- User signup and login
- Lab test booking CRUD operations
- Server-side input validation
- Health check endpoint
- CORS configuration
- Service-layer unit tests
- H2 database for testing
- JaCoCo code coverage
- GitHub Actions CI

### Security
- Public signup users are assigned the USER role
- Admin APIs require ADMIN role
- Booking APIs require USER or ADMIN role
- Passwords are stored using BCrypt hashing

### Testing
- 9 tests passing
- Service-layer coverage: 79%
- Overall JaCoCo coverage: 54%

### Fixed
- Added validation for user registration
- Added validation for lab bookings
- Configured test database
- Fixed GitHub Actions Maven permission issue