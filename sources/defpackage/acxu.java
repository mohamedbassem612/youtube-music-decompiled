package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acxu {
    public static final /* synthetic */ int a = 0;
    private static final Field b = c();

    static {
        new ExtensionRegistryLite().b(asma.b);
    }

    public static byte[] a(aigj aigjVar) {
        InputStream inputStreamH = aigjVar.h();
        Field field = b;
        if (field == null || !(inputStreamH instanceof ByteArrayInputStream)) {
            return aigjVar.G();
        }
        try {
            byte[] bArr = (byte[]) field.get(inputStreamH);
            return bArr == null ? aigjVar.G() : bArr;
        } catch (IllegalAccessException unused) {
            return aigjVar.G();
        }
    }

    public static void b(aihh aihhVar, asmv asmvVar) {
        aihhVar.e(arrj.a, asmvVar.toByteString());
    }

    private static Field c() {
        try {
            Field declaredField = ByteArrayInputStream.class.getDeclaredField("buf");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}
