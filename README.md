<h1> 스프링부트 IoC 컨테이너 클론 - v1 </h1>

<div class="box">
  <strong>핵심 개념:</strong><br>
  Spring 없이 직접 객체를 생성하고 의존성을 주입하는 가장 단순한 IoC 구조
</div>

<h2>1️⃣ ApplicationContext 구조</h2>

<pre>
public class ApplicationContext {
    public static TestPostService testPostService;
    public static TestPostRepository testPostRepository;
    public static TestFacadePostService testFacadePostService;

    public ApplicationContext() {
        testPostRepository = new TestPostRepository();
        testPostService = new TestPostService();
        testFacadePostService = new TestFacadePostService();
    }


    public <T> T genBean(String beanName) {
        switch (beanName) {
            case "testPostService" -> {
                if (testPostService == null) {
                    testPostService = new TestPostService();
                }

                return (T) testPostService;
            }

            case "testPostRepository" -> {
                if (testPostRepository == null) {
                    testPostRepository = new TestPostRepository();
                }

                return (T) testPostRepository;
            }

            case "testFacadePostService" -> {
                if (testFacadePostService == null) {
                    testFacadePostService = new TestFacadePostService();
                }

                return (T) testFacadePostService;
            }
        }

        return null;
    }
}

</pre>

<hr>

<h2>2️⃣ 동작 흐름</h2>

<pre>
ApplicationContext 생성
        ↓
TestPostRepository 생성  
        ↓
TestPostService 생성 (TestPostRepository 주입)
        ↓
testFacadePostService 생성 (TestPostRepository, TestPostService 주입)
  
</pre>

<h2>3️⃣ 사용 방법</h2>

v1의 요구사항대로 처음엔 하드코딩으로 작성하였습니다.
v2는 요구사항대로 빈 생성 시 하드코딩 방식을 사용하지 않고 작성하겠습니다.

</body>
</html>
