/*
 * ---Welcome to Coder's House--- * 

 * ------------------------------ * 

 * LUONG VU  * 
 * DUY NGUYEN * 
 * HOANG ANH * 
 * PHUONG MY  * 

 * ------------------------------ * 

 * Add: 57 - 53 - Tan Phong W - D7 - HCMC  * 
 * Phone Nu: +84 0935710974 * 
 * Skype: luongvu.work@gmail.com * 
 * Email: luongvu.work@gmail.com * 

 * ------------------------------ * 

 * Copyright (C) 2019 LUONG VU TECHNOLOGY
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package application;

import lib.Database;

/**
 *
 * @author LUONG VU TECHNOLOGY
 */
public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        db.DatabaseConnect();
    }
}
