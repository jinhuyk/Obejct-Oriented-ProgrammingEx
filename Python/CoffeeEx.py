#!/usr/bin/env python
# coding: utf-8


class Customer:
    def order(menuName, menu, barista):
        menuItem = menu.chooseCoffee(menuName)
        coffee= barista.makeCoffee(menuItem)
class MenuItem:
    def __init__(self, name,price):
        self.__name = name
        self.__price = price
    def getName(self):
        return sef.__name
    def getPrice(self):
        return sef.__price
class Menu:
    def __init__(self, items):
        this.items = items
    def choooseCoffee(name):
        for item in items:
            if(item.name == name):
                return item
        return null
class Barista:
    def makeCoffee(menuitem):
        coffee = Coffee(menuitem)
        return coffee
class Coffee:
    def __init__(self, menuItem):
        self.__name = menuItem.name
        self.__price = menuItem.price
    




