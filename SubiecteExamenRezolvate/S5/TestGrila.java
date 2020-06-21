import java.util.ArrayList;
import java.util.Arrays;

public class TestGrila {
	String denumire;		//minim 5 caractere, maxim 50
	int punctajMaxim;		//cuprins in intervalul [10, 90]
	int dificultate;		//cuprinsa in intervalul [1, 5]
	
	ArrayList<String> intrebari;
	ArrayList<Integer> punctajeIntrebari;
	
	
	public TestGrila(String denumire, int punctajMaxim, int dificultate) {
		super();
		this.denumire = denumire;
		this.punctajMaxim = punctajMaxim;
		this.dificultate = dificultate;
	}
	
	public void setIntrebari(String[] intrebari, int[] punctaje){
		this.intrebari = (ArrayList<String>) Arrays.asList(intrebari);
		this.punctajeIntrebari = new ArrayList<>();
		for(int puncte : punctaje)
			this.punctajeIntrebari.add(puncte);
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public ArrayList<String> getIntrebari() {
		return intrebari;
	}

	public void setIntrebari(ArrayList<String> intrebari) {
		this.intrebari = intrebari;
	}

	public int getDificultate() {
		return dificultate;
	}

	public void setDificultate(String dificultate) {
		if(dificultate.equals("usor"))
			this.dificultate = 1;
		if(dificultate.equals("dificil"))
			this.dificultate = 2;
		if(dificultate.equals("pro"))
			this.dificultate = 3;
		throw new UnsupportedOperationException(); 
	}
	
	//calculeaza suma punctelor tuturor intrebarilor din test
	public int calculTotalPuncte(){
		int total = 0;
		for(int punctaj : this.punctajeIntrebari)
			total += punctaj;
		
		switch(this.dificultate) {
		case 1:
			return total;
		case 2: 
			return total * 2;
		default:
			throw new UnsupportedOperationException();
		}
		
	}
	
	public float calculPunctajPerIntrebare() {
		return this.punctajMaxim / this.intrebari.size();
	}
	
	public void ajustarePunctaje() {
		
	}
	
}

    // if(typeof input !== 'string'){
    //     throw new Error("Input should be a string")
    // } else {
    //     let vecNou = [];
    //     let split = input.split(' ')
    //     for(let i = 0; i < dictionary.length; i++){
    //         if(typeof dictionary[i] !== 'string'){
    //             throw new Error("Invalid dictionary format")
    //         } 
    //     }
    //     for(let i = 0; i < split.length; i++){
    //         let letter = split[i].charAt(0)
    //         if(dictionary.find(x => x === split[i].toLowerCase())){
    //             let x = split[i]
    //             let ultimaLitera = x.charAt(x.length-1)
    //             letter = letter.padEnd(x.length - 1, '*')
    //             letter = letter + '' + ultimaLitera
    //             vecNou.push(letter)
    //         } else if(!dictionary.find(x => x === split[i])){
    //             vecNou.push(split[i])
    //         }
    //     }
    //     vecNou = vecNou.join(" ");
    //     return vecNou
    // }
