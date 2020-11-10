# atm-simulator

This is a simple atm simulator project I started to get myself
familiar with IntelliJ IDEA


## Dependencies

- OpenJDK >= 8 (14.0 is recommended)
- IntelliJ IDEA (optional)


## Quick Start

### Install OpenJDK

#### Arch based distros

```
$ sudo pacman -S jdk-openjdk 14.0
```

#### Debian based distros

```
$ sudo apt install openjdk-14-jdk
```

### Get the code

```
$ git clone git@github.com:KNaiskes/atm-simulator.git
```

### Import project

In IntelliJ find project by clicking File > Open... in the top menu


### Build and run

Click in the top menu Run > Run Main or press Shift + F10

## Available options

- Withdraw
- Deposit
- View available balance
- Change password (does not really change user's password as it is not used a
real database)

## Database

This project *does not* use any real database as it would be out of its scope.
Instead a HashMap is used as a "fake" database as result the lookup (search)
complexity is O(1).
