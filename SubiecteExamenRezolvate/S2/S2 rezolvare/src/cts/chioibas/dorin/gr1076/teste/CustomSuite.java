package cts.chioibas.dorin.gr1076.teste;

import org.junit.experimental.categories.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({CategorieCustom.class})
@Suite.SuiteClasses({FacturareTest.class, ProdusTest.class})
public class CustomSuite {

}
