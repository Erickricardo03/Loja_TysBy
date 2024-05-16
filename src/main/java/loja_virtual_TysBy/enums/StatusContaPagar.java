package loja_virtual_TysBy.enums;

public enum StatusContaPagar {
	
	COBRANCA("Pagar"),
	Vencida("Vencida"),
	ABERTA("Aberta"),
	QUITADA("Quitada"),
	NEGOCIADA("ReNegociada");
	
	
	private String descricao;
	
	private StatusContaPagar(String descricao) {
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
	
	

