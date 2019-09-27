package programs.hackerrank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumericDataType<T extends Number> implements DataType<T>{
	NumberFormat nf=new DecimalFormat("#.00");
	@Override
	public void addition(Object a, Object b) {
		BigDecimal aa=new BigDecimal(a.toString());
		BigDecimal bb=new BigDecimal(b.toString());
		BigDecimal result=aa.add(bb);
		System.out.println("addition");
		System.out.println(nf.format(result));
	}
	@Override
	public void substraction(T a, T b) {
		BigDecimal aa=new BigDecimal(a.toString());
		BigDecimal bb=new BigDecimal(b.toString());
		BigDecimal result=aa.subtract(bb);
		System.out.println("substraction");
		System.out.println(nf.format(result));
		
	}

	@Override
	public void mulitplication(T a, T b) {
		BigDecimal aa=new BigDecimal(a.toString());
		BigDecimal bb=new BigDecimal(b.toString());
		BigDecimal result=aa.multiply(bb);
		System.out.println("multiplication");
		System.out.println(nf.format(result));
		
	}

	@Override
	public void division(T a, T b) {
		BigDecimal aa=new BigDecimal(a.toString());
		BigDecimal bb=new BigDecimal(b.toString());
		System.out.println("division");
		BigDecimal result=aa.divide(bb, 2, RoundingMode.HALF_EVEN);
		System.out.println(nf.format(result));
		 
		
	}
	
	public void operations(T a, T b) {
		this.addition(a, b);
		this.substraction(a, b);
		this.mulitplication(a, b);
		this.division(a, b);
	}
	
	public static void main(String[] args) {
		System.out.println("-----------Integer test-------");
		NumericDataType<Integer> idt=new NumericDataType<>();
		Integer a=122;
		Integer b=22;
		idt.operations(a, b);
		
		System.out.println("------Float test---------");
		NumericDataType<Float> fdt=new NumericDataType<>();
		Float f1=122.5f;
		Float f2=22f;
		fdt.operations(f1, f2);
		
		System.out.println("-----Double test-------");
		NumericDataType<Double> ddt=new NumericDataType<>();
		Double d1=122.8;
		Double d2=22.3;
		ddt.operations(d1, d2);
		
		
	}

}
