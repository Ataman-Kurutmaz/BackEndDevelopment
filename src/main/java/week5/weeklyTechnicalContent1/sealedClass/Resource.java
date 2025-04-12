package week5.weeklyTechnicalContent1.sealedClass;

public sealed interface Resource<T> permits Resource.Success,Resource.Fail,Resource.Error {
    record Success<T>(T data) implements Resource<T>{}
    record Fail<T>(String message) implements Resource<T>{}
    record Error<T>(Throwable throwable) implements Resource<T>{}
}
