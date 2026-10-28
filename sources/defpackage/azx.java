package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class azx {
    public azx() {
    }

    static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static void c(View view, List list) {
        view.setSystemGestureExclusionRects(list);
    }

    public static void d(View view) {
        Iterator itA = new awta(new bah(view, null), 1).a();
        while (itA.hasNext()) {
            n((View) itA.next()).a();
        }
    }

    public static bjf e(Object obj, Object obj2) {
        bjf bjfVarA = (bjf) obj;
        bjf bjfVar = (bjf) obj2;
        if (!bjfVar.isEmpty()) {
            if (!bjfVarA.b) {
                bjfVarA = bjfVarA.a();
            }
            bjfVarA.b();
            if (!bjfVar.isEmpty()) {
                bjfVarA.putAll(bjfVar);
            }
        }
        return bjfVarA;
    }

    public static /* synthetic */ ListenableFuture f(awou awouVar, awqk awqkVar) {
        awouVar.getClass();
        return ape.f(new oen(awouVar, awqkVar, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dyp g(byte[] bArr) {
        int length = bArr.length;
        if (length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (length == 0) {
            return dyp.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            objectInputStream.close();
                        } catch (Throwable th3) {
                            avkz.d(th, th3);
                        }
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s != -21521) {
                        throw new IllegalStateException(a.bR(s, "Magic number doesn't match: "));
                    }
                    short s2 = dataInputStream.readShort();
                    if (s2 != 1) {
                        throw new IllegalStateException(a.bR(s2, "Unsupported version number: "));
                    }
                    int i3 = dataInputStream.readInt();
                    for (int i4 = 0; i4 < i3; i4++) {
                        byte b = dataInputStream.readByte();
                        Object utf = null;
                        if (b != 0) {
                            if (b == 1) {
                                utf = Boolean.valueOf(dataInputStream.readBoolean());
                            } else if (b == 2) {
                                utf = Byte.valueOf(dataInputStream.readByte());
                            } else if (b == 3) {
                                utf = Integer.valueOf(dataInputStream.readInt());
                            } else if (b == 4) {
                                utf = Long.valueOf(dataInputStream.readLong());
                            } else if (b == 5) {
                                utf = Float.valueOf(dataInputStream.readFloat());
                            } else if (b == 6) {
                                utf = Double.valueOf(dataInputStream.readDouble());
                            } else if (b == 7) {
                                utf = dataInputStream.readUTF();
                            } else if (b == 8) {
                                int i5 = dataInputStream.readInt();
                                Boolean[] boolArr = new Boolean[i5];
                                for (int i6 = 0; i6 < i5; i6++) {
                                    boolArr[i6] = Boolean.valueOf(dataInputStream.readBoolean());
                                }
                                utf = (Serializable) boolArr;
                            } else if (b == 9) {
                                int i7 = dataInputStream.readInt();
                                Byte[] bArr3 = new Byte[i7];
                                for (int i8 = 0; i8 < i7; i8++) {
                                    bArr3[i8] = Byte.valueOf(dataInputStream.readByte());
                                }
                                utf = (Serializable) bArr3;
                            } else if (b == 10) {
                                int i9 = dataInputStream.readInt();
                                Integer[] numArr = new Integer[i9];
                                for (int i10 = 0; i10 < i9; i10++) {
                                    numArr[i10] = Integer.valueOf(dataInputStream.readInt());
                                }
                                utf = (Serializable) numArr;
                            } else if (b == 11) {
                                int i11 = dataInputStream.readInt();
                                Long[] lArr = new Long[i11];
                                for (int i12 = 0; i12 < i11; i12++) {
                                    lArr[i12] = Long.valueOf(dataInputStream.readLong());
                                }
                                utf = (Serializable) lArr;
                            } else if (b == 12) {
                                int i13 = dataInputStream.readInt();
                                Float[] fArr = new Float[i13];
                                for (int i14 = 0; i14 < i13; i14++) {
                                    fArr[i14] = Float.valueOf(dataInputStream.readFloat());
                                }
                                utf = (Serializable) fArr;
                            } else if (b == 13) {
                                int i15 = dataInputStream.readInt();
                                Double[] dArr = new Double[i15];
                                for (int i16 = 0; i16 < i15; i16++) {
                                    dArr[i16] = Double.valueOf(dataInputStream.readDouble());
                                }
                                utf = (Serializable) dArr;
                            } else {
                                if (b != 14) {
                                    throw new IllegalStateException(a.bR(b, "Unsupported type "));
                                }
                                int i17 = dataInputStream.readInt();
                                String[] strArr = new String[i17];
                                for (int i18 = 0; i18 < i17; i18++) {
                                    String utf2 = dataInputStream.readUTF();
                                    if (true == awrc.c(utf2, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                        utf2 = null;
                                    }
                                    strArr[i18] = utf2;
                                }
                                utf = (Serializable) strArr;
                            }
                        }
                        linkedHashMap.put(dataInputStream.readUTF(), utf);
                    }
                    dataInputStream.close();
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        try {
                            dataInputStream.close();
                        } catch (Throwable th6) {
                            avkz.d(th4, th6);
                        }
                        throw th5;
                    }
                }
            }
        } catch (IOException e) {
            String str = dyq.a;
            dzf.b();
            Log.e(str, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            String str2 = dyq.a;
            dzf.b();
            Log.e(str2, "Error in Data#fromByteArray: ", e2);
        }
        return new dyp(linkedHashMap);
    }

    public static byte[] h(dyp dypVar) {
        int i;
        dypVar.getClass();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                int i2 = 1;
                dataOutputStream.writeShort(1);
                Map map = dypVar.b;
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        dataOutputStream.writeByte(0);
                    } else if (value instanceof Boolean) {
                        dataOutputStream.writeByte(i2);
                        dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                    } else if (value instanceof Byte) {
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeByte(((Number) value).byteValue());
                    } else if (value instanceof Integer) {
                        dataOutputStream.writeByte(3);
                        dataOutputStream.writeInt(((Number) value).intValue());
                    } else if (value instanceof Long) {
                        dataOutputStream.writeByte(4);
                        dataOutputStream.writeLong(((Number) value).longValue());
                    } else if (value instanceof Float) {
                        dataOutputStream.writeByte(5);
                        dataOutputStream.writeFloat(((Number) value).floatValue());
                    } else if (value instanceof Double) {
                        dataOutputStream.writeByte(6);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else if (value instanceof String) {
                        dataOutputStream.writeByte(7);
                        dataOutputStream.writeUTF((String) value);
                    } else {
                        if (!(value instanceof Object[])) {
                            Class<?> cls = value.getClass();
                            int i3 = awrn.a;
                            throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new awqv(cls).c())));
                        }
                        Object[] objArr = (Object[]) value;
                        Class<?> cls2 = objArr.getClass();
                        int i4 = awrn.a;
                        awqv awqvVar = new awqv(cls2);
                        int i5 = 11;
                        int i6 = 10;
                        int i7 = 8;
                        if (awrc.c(awqvVar, new awqv(Boolean[].class))) {
                            i = 8;
                        } else if (awrc.c(awqvVar, new awqv(Byte[].class))) {
                            i = 9;
                        } else if (awrc.c(awqvVar, new awqv(Integer[].class))) {
                            i = 10;
                        } else if (awrc.c(awqvVar, new awqv(Long[].class))) {
                            i = 11;
                        } else if (awrc.c(awqvVar, new awqv(Float[].class))) {
                            i = 12;
                        } else if (awrc.c(awqvVar, new awqv(Double[].class))) {
                            i = 13;
                        } else {
                            if (!awrc.c(awqvVar, new awqv(String[].class))) {
                                throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new awqv(objArr.getClass()).b())));
                            }
                            i = 14;
                        }
                        dataOutputStream.writeByte(i);
                        int length = objArr.length;
                        dataOutputStream.writeInt(length);
                        int i8 = 0;
                        while (i8 < length) {
                            Object obj = objArr[i8];
                            if (i == i7) {
                                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                                dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                            } else if (i == 9) {
                                Byte b = obj instanceof Byte ? (Byte) obj : null;
                                dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                            } else if (i == i6) {
                                Integer num = obj instanceof Integer ? (Integer) obj : null;
                                dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                            } else if (i == i5) {
                                Long l = obj instanceof Long ? (Long) obj : null;
                                dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                            } else if (i == 12) {
                                Float f = obj instanceof Float ? (Float) obj : null;
                                dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                            } else if (i == 13) {
                                Double d = obj instanceof Double ? (Double) obj : null;
                                dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                            } else {
                                String str2 = obj instanceof String ? (String) obj : null;
                                dataOutputStream.writeUTF(str2 != null ? str2 : "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d");
                            }
                            i8++;
                            i5 = 11;
                            i6 = 10;
                            i7 = 8;
                        }
                    }
                    dataOutputStream.writeUTF(str);
                    i2 = 1;
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        dataOutputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        avkz.d(th, th3);
                        throw th2;
                    }
                }
            }
        } catch (IOException e) {
            String str3 = dyq.a;
            dzf.b();
            Log.e(str3, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static boolean i(String str, Function0 function0) {
        try {
            boolean zBooleanValue = ((Boolean) function0.invoke()).booleanValue();
            if (zBooleanValue) {
                return zBooleanValue;
            }
            Log.e("ReflectionGuard", str);
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static boolean j(Function0 function0) {
        try {
            function0.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean k(Method method, Class cls) {
        cls.getClass();
        return method.getReturnType().equals(cls);
    }

    public static boolean l(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    public static boolean m(Method method, awsd awsdVar) {
        return k(method, ((awqv) awsdVar).b);
    }

    public static zs n(View view) {
        zs zsVar = (zs) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (zsVar != null) {
            return zsVar;
        }
        zs zsVar2 = new zs();
        view.setTag(R.id.pooling_container_listener_holder_tag, zsVar2);
        return zsVar2;
    }

    public static djl o(Object obj) {
        return (djl) ((ci) obj).a;
    }

    public azx(byte[] bArr) {
    }
}
