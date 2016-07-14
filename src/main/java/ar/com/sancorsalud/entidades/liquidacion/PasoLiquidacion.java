/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sancorsalud.entidades.liquidacion;

/**
 *
 * @author hzanuzzi
 */
public enum PasoLiquidacion {
    GeneracionCuentasLiquidar(1),
    CalculoValorPlan(2),
    CalculoValorCuotaSocial(3),
    CalculoValorCoseguro(4),
    CalculoValorBasInt(5),
    CalculoValorSubsidioVida(6),
    CalculoValorSubsidioEmergencia(7),
    CalculoValorBonificacionHijo(8),
    CalculoValorBonificacionPermanencia(9),
    CalculoValorBonificacionGrupoNumeroso(10),
    CalculoValorBonificacionCategoria(11),
    CalculoValorBonificacionAportes(12),
    CalculoValorBonificacionEmpresa(13),
    CalculoValorBonificacionGrupoAfinidad(14),
    CalculoValorBonificacionResponsableInscripto(15),
    GeneracionConceptosFinalesPersona(16),
    GeneracionConceptosFinalesCuenta(17);
    
    Integer valor;

    PasoLiquidacion(Integer v){
         valor = v;
    }
}
