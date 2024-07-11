package loja_virtual_TysBy.enums;

public enum StatusContaReceber {
	
	COBRANCA("Pagar"),
	Vencida("Vencida"),
	ABERTA("Aberta"),
	QUITADA("Quitada");
	
	
	private String descricao;
	
	private StatusContaReceber(String descricao) {
		this.descricao = descricao;
		
		}
	public String getDescString() {
		return descricao;
	}
	
	@Override
	public String toString() {
	
		return this.descricao;
		
	}
	
}
	
	

