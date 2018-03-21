package Process;

//Metodo Directo

public class AccountingMath2 
{
    private double value1, value2;
    // Main Variables
    private double selling, sellingCost, initialInventory, finalInventory;
    //Specific Variables
    private double var_UnitCostProd, static_UnitCost, static_AdminSpend, var_UnitOp, margen, cost_varUnit,staticCost;
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
        
        return initialInventory = value1 * (double)cost_varUnit;
    }
    
    public double costoVarTotal ()
    {
        return cost_varUnit= var_UnitCostProd + var_UnitOp;
    }
    
    public double inventarioFinal()
    {
        return finalInventory =  invFinal * cost_varUnit;
    }
    
    public double CostoVarDeVentas()
    {
          
        return sellingCost = initialInventory + cost_varUnit - finalInventory;
    }
    
    public double MargenConstribucion()
    {
        return margen= selling - sellingCost;
    }
    
    public double CostoFijo()
    {
      return  staticCost = static_UnitCost+ static_AdminSpend;
    }
    
    public double UtilidadNeta()
    {
        return staticCost-margen;
    }
    
    
    
}