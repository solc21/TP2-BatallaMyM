# My Java Project

## Overview
This project is a battle system inspired by magical combat, featuring various character types, spells, and a battalion management system. The design follows object-oriented principles and utilizes interfaces and abstract classes to ensure modularity and extensibility.

## Project Structure
The project is organized into the following directories:

- **src/main/java/com/myjavaproject**: Contains the main application code.
  - **interfaces**: Defines interfaces for observers and combat characters.
  - **classes**: Contains core classes such as `Batallon`, `Personaje`, and factories for creating characters and spells.
  - **personajes**: Contains classes for different character types like `Auror`, `Mago`, and `Mortifago`.
  - **observadores**: Contains classes that implement observer patterns for battalion state and member changes.
  - **magias**: Contains classes for various spells and their factories.
  - **equipamiento**: Contains classes for character equipment like `Varita` and `SistemaDefensivo`.

- **src/test/java/com/myjavaproject**: Contains JUnit tests for the application, ensuring the functionality of core classes.

## Setup Instructions
1. **Clone the Repository**: Clone this project to your local machine using Git.
2. **Import into Eclipse**: Open Eclipse and import the project as an existing Maven project.
3. **Build the Project**: Ensure all dependencies are resolved and the project builds successfully.
4. **Run the Application**: Execute the `Main` class to start the application.
5. **Run Tests**: Use JUnit to run the tests located in the `src/test/java/com/myjavaproject` directory.

## Dependencies
This project uses JUnit for testing. Ensure that the JUnit library is included in your build path.

## Contribution
Feel free to contribute to this project by forking the repository and submitting pull requests with improvements or new features.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.