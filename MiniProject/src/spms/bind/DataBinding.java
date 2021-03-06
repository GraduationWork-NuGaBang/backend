package spms.bind;

// 페이지 컨트롤러 중에서 클라이언트가 보낸 데이터가 필요한 경우 이 인터페이스를 구현
public interface DataBinding {
    // getDataBinders 메서드의 반환값은 데이터의 이름과 타입 변조를 담은 Object 의 배열이다.
    Object[] getDataBinders();
}
