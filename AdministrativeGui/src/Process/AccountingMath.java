
package Process;

//Metodo Absorbente

import GUI.AbsorbentMethodWindow;


/**
 *
 * @author Queen_Joker
 */

public class AccountingMath 
{
    // Generic Variables
    //private double value1/**/, value2;
    // Main Variables
    private double sellingCost,  manufCost/*Unitario*/, operationSpend,totalSelling,quantityProduct/*cantidad de producto*/;
    private double administrationSpend, financialSpend, rawUti;
    //Specific Variables
    private double var_sellingSpending, var_UnitCost, static_UnitCost, static_TotalCost, static_AdminCost;
    private int production, invFinal, selling/*unidades*/,initialInventory, finalInventory, totalManufCost;
    
    //Note: Check the correct writing of static_UnitCost(Costo Fijo Unitario)
    //Note: Translate properly cost and spend >:,v
    
    public double Ventas()
    {   this.selling= Integer.parseInt( AbsorbentMethodWindow.selling.getText());
        //this.value1 = value1;
        this.quantityProduct = Double.parseDouble(AbsorbentMethodWindow.quantityProduct.getText());
       
        return totalSelling = selling* (double)quantityProduct;
    }
    
    public double costoArtoManufunit ()
    {
        this.static_UnitCost = (double) AbsorbentMethodWindow.static_UnitCost.getValue();
        this.production = (int) AbsorbentMethodWindow.production.getValue();
    
        static_TotalCost = static_TotalCost / (int) production;
        
        return manufCost = var_UnitCost + static_UnitCost;
    }
    
    public double inventarioInic()
    {
        
        this.initialInventory= (int) AbsorbentMethodWindow.initialInventory.getValue();
        
        return  initialInventory * manufCost;
    }
    
    public double costoManufTotal()
    {
        this.totalManufCost= (int) AbsorbentMethodWindow.totalManufCost.getValue();
        
        return totalManufCost * manufCost;
    }
    
    public double inventarioFinal()
    {
        this.invFinal= (int) AbsorbentMethodWindow.invFinal.getValue();
        
        return invFinal * manufCost;
    }
    
    
    
    public double CostoDeVentas()
    {
          
        return sellingCost = initialInventory + manufCost - finalInventory;
    }
    
    public double utilidadBruta()
    {
        return rawUti= selling-sellingCost;
    }
    
    public double gastoOperacion()
    {
    
        return operationSpend = selling * (double) var_sellingSpending + 
               (double) static_AdminCost;
        
        //Note: Verify the rule of Financial Spend 
    }
    
    public double utilidadOperacion()
    {
            return rawUti-operationSpend;
    }    
}//end Class
