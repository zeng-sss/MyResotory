public class ItemsMapperTest {
    @Test
    public void testFindItemsById(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        ItemsMapper itemsMapper = applicationContext.getBean(ItemsMapper.class);
        Items items = itemsMapper.findById(1);
        System.out.println(items);
		sou(dddddddddddddddddddddddddd);
		sou(dddddddddddddddddddddddddd);
		sou(dddddddddddddddddddddddddd);
		sou(dddddddddddddddddddddddddd);
		sou(dddddddddddddddddddddddddd);
		sou(dddddddddddddddddddddddddd);

    }

}
