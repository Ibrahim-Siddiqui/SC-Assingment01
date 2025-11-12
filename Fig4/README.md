# Fig4 — Shipping strategy demo

This folder contains a small Java implementation for the UML shown in Fig4: `Order` delegates shipping calculations to a `Shipping` strategy. Concrete strategies `Ground` and `Air` demonstrate how adding new shipping methods doesn't require changing `Order`.

Files:
- `src/fig4/OrderItem.java` — simple value object for items
- `src/fig4/Order.java` — aggregates items and delegates shipping
- `src/fig4/Shipping.java` — shipping strategy interface
- `src/fig4/Ground.java` — ground shipping implementation
- `src/fig4/Air.java` — air shipping implementation
- `src/fig4/Main.java` — demo `main` to exercise the classes

How to compile (PowerShell):

```powershell
javac Fig4/src/fig4/*.java -d Fig4/bin
java -cp Fig4/bin fig4.Main
```

Quick Git commands to push this folder (replace URL):

```powershell
cd "C:\Users\Mohit Computers\Desktop\SC-Assingment"
git add Fig4
git commit -m "Add Fig4 shipping demo"
git push
```
