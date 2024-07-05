package transportado;

public enum TipoFrete {

	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Normal();
			
		}
	},
	SEDEX {
		@Override
		public Frete obterFrete(){
			return new Sedex();
	}
};
	


public Frete obterFrete() {
	return null;
}

}
