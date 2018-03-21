
package Process;

//Metodo Absorbente

/**
 *
 * @author Queen_Joker
 */

public class AccountingMath 
{
    // Generic Variables
    private double value1, value2;
    // Main Variables
    private double selling, sellingCost, initialInventory, finalInventory, manufCost, operationSpend;
    private double administrationSpend, financialSpend, rawUti;
    //Specific Variables
    private double var_sellingSpending, var_UnitCost, static_UnitCost, static_TotalCost, static_AdminCost;
    private int quantityProduct, production, invFinal;
    
    //Note: Check the correct writing of static_UnitCost(Costo Fijo Unitario)
    //Note: Translate properly cost and spend >:,v
    
    public double Ventas(double value1, int value2)
    {
        this.value1 = value1;
        this.quantityProduct = value2;
       
        return selling = value1 * (double)quantityProduct;
    }
    
    public double inventarioInic(double value1, int value2)
    {
        
        this.value1 = value1;
        this.quantityProduct = value2;
        
        return initialInventory = value1 * (double)quantityProduct;
    }
    
    public double inventarioFinal()
    {
        
        return invFinal * manufCost;
    }
    
    public double costoArtoManuf ()
    {
    
        static_UnitCost = static_TotalCost / (double) production;
        
        return manufCost = var_UnitCost + static_UnitCost;
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
