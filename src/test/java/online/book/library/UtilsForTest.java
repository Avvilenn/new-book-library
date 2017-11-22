package online.book.library;

import java.util.Optional;
import java.util.function.Function;

public interface UtilsForTest {

    static <T> void compareActualResult(T actual, Function<T, Boolean> verifier, Function<T, String> errorReporter) {
        Optional.of(verifier.apply(actual)).filter((result) -> {
            return !result.booleanValue();
        }).ifPresent((r) -> {
            throw new AssertionError(errorReporter.apply(actual));
        });
    }
}
