package Process;

import GUI.DirectMethodWindow;

//Metodo Directo

public class AccountingMath2 
{
    //private double value1, value2;
    // Main Variables
    private double CostoUnitVentas, VentasNetas, CostoVarProd, CostoVarOp,CostoVarUnit;
    //Specific Variables
    private double CostoVarVenta,MargenContr,CostoFijoProd,CostoFijoAdm,CostoFijo,UtilidadNeta;
    private int Ventas, InvInicial,ArtManuf, InvFinal;

 //Note: Check the correct writing of static_UnitCost(Costo Fijo Unitario)
    //Note: Translate properly cost and spend >:,v
    
    public double Ventas()
    {
        this.Ventas= Integer.parseInt( DirectMethodWindow.Ventas.getText());
        //this.value1 = value1;
        this.CostoUnitVentas = Double.parseDouble(DirectMethodWindow.CostoUnitVentas.getText());
       
        return VentasNetas = Ventas*CostoUnitVentas;
    }
    
    public double CostoVariable()
    {
        this.CostoVarProd= Double.parseDouble( DirectMethodWindow.CostoVarProd.getText());
        //this.value1 = value1;
        this.CostoVarOp = Double.parseDouble(DirectMethodWindow.CostoVarOp.getText());
       
        return CostoVarUnit = CostoVarProd + CostoVarOp;
    }
    
    public double CostoVariableDeVenta()
    {
        this.InvInicial= Integer.parseInt( DirectMethodWindow.InvInicial.getText());
        //this.value1 = value1;
        this.ArtManuf = Integer.parseInt(DirectMethodWindow.ArtManuf.getText());
        
        this.InvFinal = Integer.parseInt(DirectMethodWindow.InvFinal.getText());
        
        return CostoVarVenta = InvInicial + ArtManuf - InvFinal;
    }
    
    public Double Margen()
    {
        return MargenContr = VentasNetas - CostoVarVenta;
    }
    
    public Double CostoFijo()
    {
        this.CostoFijoProd = Double.parseDouble(DirectMethodWindow.CostoFijoProd.getText());
        this.CostoFijoAdm = Double.parseDouble(DirectMethodWindow.CostoFijoAdm.getText());
        return CostoFijo = CostoFijoProd + CostoFijoAdm;
    }
    
    public Double UtilidadNeta()
    {
        return UtilidadNeta= MargenContr -CostoFijo;
    } 
    
    






}