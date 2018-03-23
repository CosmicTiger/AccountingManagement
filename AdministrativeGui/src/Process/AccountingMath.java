
package Process;

//Metodo Absorbente

import GUI.AbsorbentMethodWindow;

public class AccountingMath 
{
    // Generic Variables
    //private double value1/**/, value2;
    // Main Variables
    private double sellingCost,  manufCost/*Unitario*/, operationSpend,totalSelling,quantityProduct/*cantidad de producto*/;
    private double administrationSpend, financialSpend, rawUti;
    //Specific Variables
    private double var_sellingSpending, var_UnitCost, static_UnitCost, static_TotalCost, static_AdminCost,operationUti;
    private int production, invFinal, selling/*unidades*/,initialInventory, totalManufCost;
    
    //Note: Check the correct writing of static_UnitCost(Costo Fijo Unitario)
    //Note: Translate properly cost and spend >:,v
    
    //variables de los metodos para los calculos rapidos
    private double selling1, invInicial1, invFinal1,CostoDeVentas,manufTotal1,UtilidadBruta,gastoVenta,
            gastoAdm,gastoFinanc,gastoOp,utilidadOperacion;
    
    public double Ventas()
    {   
        this.selling= Integer.parseInt( AbsorbentMethodWindow.selling.getText());
        //this.value1 = value1;
        this.quantityProduct = Double.parseDouble(AbsorbentMethodWindow.quantityProduct.getText());
       
        return totalSelling = selling* (double)quantityProduct;
    }
    
    public double costoFijoTotal ()
    {
        this.static_UnitCost = Double.parseDouble( AbsorbentMethodWindow.static_UnitCost.getText());
        this.production = Integer.parseInt( AbsorbentMethodWindow.production.getText());
        
        return static_TotalCost = static_UnitCost/ production;
        
        
    }
    
    public double costoArtiManufact  ()
    {
        return manufCost = var_UnitCost + static_TotalCost;
           
    }
    
    
    public double inventarioInic()
    {
        
        this.initialInventory = Integer.parseInt( AbsorbentMethodWindow.initialInventory.getText());
        
        return  initialInventory * manufCost;
    }
    
    public double costoManufTotal()
    {
        this.totalManufCost= Integer.parseInt( AbsorbentMethodWindow.totalManufCost.getText());
        
        return totalManufCost * manufCost;
    }
    
    public double inventarioFinal()
    {
        this.invFinal= Integer.parseInt( AbsorbentMethodWindow.invFinal.getText());
        
        return invFinal * manufCost;
    }
    
    
    
    public double CostoDeVentas()
    {
        return  (initialInventory + totalManufCost )- invFinal;
    }
    
    public double utilidadBruta()
    {
       
        return rawUti= selling-sellingCost;
    }
    
    public double gastoOperacion()
    {
    
        return operationSpend = selling * (double) var_sellingSpending + (double) static_AdminCost;
        
        //Note: Verify the rule of Financial Spend 
    }
    
    public double utilidadOperacion()
    {
            return operationUti= rawUti-operationSpend;
    }
    
    //Metodos para los calculos directos
    
    public double CostoDeVentas1()
    {   
        this.selling1= Double.parseDouble( AbsorbentMethodWindow.selling1.getText());
        //this.value1 = value1;
        this.invInicial1= Double.parseDouble(AbsorbentMethodWindow.invInicial1.getText());
        this.manufTotal1=Double.parseDouble(AbsorbentMethodWindow.manufTotal1.getText());
        this.invFinal1=Double.parseDouble(AbsorbentMethodWindow.invFinal1.getText());
       
        return CostoDeVentas = (invInicial1+manufTotal1)-invFinal1;
    }
    
    public double UtilidadBruta()
    {
        return UtilidadBruta= selling1-CostoDeVentas;
    }
    
    public double GastoDeOperacion()
    {
        this.gastoVenta = Double.parseDouble(AbsorbentMethodWindow.gastoVenta.getText());
        this.gastoAdm = Double.parseDouble(AbsorbentMethodWindow.gastoAdm.getText());
        this.gastoFinanc = Double.parseDouble(AbsorbentMethodWindow.gastoFinanc.getText());
        
        return gastoOp= gastoVenta+gastoAdm+gastoFinanc;
        
    }
    
    public double UtilidadOp()
    {
        return utilidadOperacion = UtilidadBruta-gastoOp;
    }
    
    
    


    
}//end Class
