package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class afk {
    public static final /* synthetic */ int a = 0;
    private static volatile int b;
    private static final Object c = new Object();

    private afk() {
    }

    public static int a() {
        synchronized (c) {
            if (b == 0) {
                ClassLoader classLoader = afk.class.getClassLoader();
                classLoader.getClass();
                InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
                if (resourceAsStream == null) {
                    throw new IllegalStateException(String.format("Car API level file %s not found", "car-app-api.level"));
                }
                try {
                    String line = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
                    int i = Integer.parseInt(line);
                    if (i <= 0 || i > 9) {
                        throw new IllegalStateException(a.ce(line, "Unrecognized Car API level: "));
                    }
                    b = i;
                } catch (IOException unused) {
                    throw new IllegalStateException("Unable to read Car API level file");
                }
            }
        }
        return b;
    }
}
