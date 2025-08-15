# 🛒 My Shopping List App

A simple **Jetpack Compose** Android application to manage your shopping list.  
You can **add**, **edit**, and **delete** items with quantity and units like `kg`, `g`, `l`, `ml`, `pcs`.

---

## 📌 Features
- ➕ **Add new shopping items** with name, quantity, and unit.  
- ✏️ **Edit existing items** directly from the list using a popup dialog.  
- ❌ **Delete items** from the list easily.  
- 📏 **Unit selection** (kg, g, l, ml, pcs) for better item detail.  
- 📜 **Scrollable list** using LazyColumn for smooth UI performance.  
- 🎨 Clean UI with Material 3 Design.

---

## 🖼️ Screenshots
![WhatsApp Image 2025-08-15 at 14 31 35_48c9a770](https://github.com/user-attachments/assets/c80abd8e-1bea-46bb-9c84-a2ebbaa7a87d) Add Item ![WhatsApp Image 2025-08-15 at 14 31 35_d4f033c7](https://github.com/user-attachments/assets/fa987703-2b1d-41f3-9a51-6c3aadbb2548) Edit Item ![WhatsApp Image 2025-08-15 at 14 31 35_ffe44ad5](https://github.com/user-attachments/assets/dfddcbc8-cb86-4418-b712-d1280608e76e)




---

## 🛠️ Tech Stack
- **Language:** Kotlin  
- **UI Toolkit:** Jetpack Compose  
- **Design:** Material 3  
- **Architecture:** State Management with `remember` & `mutableStateOf`  

---

## 📂 Project Structure
```
📁 my_shoping_listday_7
 ┣ 📜 MainActivity.kt          # Entry point of the app
 ┣ 📜 ShopingListApp.kt        # Main UI & state management
 ┣ 📜 ShopingItem.kt           # Data class for shopping item
 ┣ 📜 components/
 ┃   ┣ 📜 ShopingListItem.kt   # UI for displaying a single item
 ┃   ┣ 📜 DropdownMenuBox.kt   # Unit selection dropdown
 ┗ 📜 themes/                  # Material theme setup
```

---

## 🚀 How to Run
1. **Clone the repository**  
   ```bash
   git clone https://github.com/rameshwar-p001/Android_My_Shopping_list_App.git
   ```
2. **Open in Android Studio**  
3. **Sync Gradle** and install dependencies  
4. **Run the app** on emulator or physical device  

---

## 📚 Learning Points (Day 7)
From this project, I learned:
- ✅ Using **LazyColumn** for large lists  
- ✅ Creating and using **AlertDialog** in Compose  
- ✅ State management using `remember` and `mutableStateOf`  
- ✅ Creating **custom dropdown menus** for unit selection  
- ✅ Adding, editing, and deleting items dynamically  

---

## 💡 Future Improvements
- Save data using Room Database / DataStore  
- Add search functionality  
- Add categories for items  
