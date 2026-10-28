package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aihn extends aifs {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static final ConcurrentMap parserOrInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected aijt unknownFields = aijt.a;

    /* JADX INFO: Access modifiers changed from: private */
    public static aihl checkIsLite(aigw aigwVar) {
        return (aihl) aigwVar;
    }

    private static aihn checkMessageInitialized(aihn aihnVar) throws aiik {
        if (aihnVar == null || aihnVar.isInitialized()) {
            return aihnVar;
        }
        throw aihnVar.newUninitializedMessageException().a();
    }

    private int computeSerializedSize(aijg aijgVar) {
        return aijgVar == null ? aiiz.a.a(this).a(this) : aijgVar.a(this);
    }

    protected static aihp emptyBooleanList() {
        return aiga.b;
    }

    protected static aihq emptyDoubleList() {
        return aigt.b;
    }

    public static aihu emptyFloatList() {
        return aihc.b;
    }

    public static aihv emptyIntList() {
        return aiho.a;
    }

    public static aihy emptyLongList() {
        return aiio.a;
    }

    public static aiie emptyProtobufList() {
        return aija.b;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == aijt.a) {
            this.unknownFields = new aijt();
        }
    }

    static aihn getDefaultInstance(Class cls) {
        ConcurrentMap concurrentMap = parserOrInstanceMap;
        Object defaultInstanceForType = concurrentMap.get(cls);
        if (defaultInstanceForType == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                defaultInstanceForType = concurrentMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (defaultInstanceForType == null) {
            defaultInstanceForType = ((aihn) aijy.d(cls)).getDefaultInstanceForType();
            if (defaultInstanceForType == null) {
                throw new IllegalStateException();
            }
            concurrentMap.put(cls, defaultInstanceForType);
        }
        if (defaultInstanceForType instanceof aihn) {
            return (aihn) defaultInstanceForType;
        }
        int i = aihg.b;
        return ((aihg) defaultInstanceForType).a;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static aiix getParserForClass(Class cls) {
        ConcurrentMap concurrentMap = parserOrInstanceMap;
        Object obj = concurrentMap.get(cls);
        if (obj == null) {
            getDefaultInstance(cls);
            obj = concurrentMap.get(cls);
        }
        if (obj == null) {
            throw new IllegalStateException("Default instance cannot be null.");
        }
        if (obj instanceof aiix) {
            return (aiix) obj;
        }
        aihg aihgVar = new aihg((aihn) obj);
        return concurrentMap.replace(cls, obj, aihgVar) ? aihgVar : (aiix) concurrentMap.get(cls);
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInitialized(aihn aihnVar, boolean z) {
        Object objDynamicMethod = aihnVar.dynamicMethod(aihm.a, null, null);
        if (objDynamicMethod == null) {
            return true;
        }
        if (objDynamicMethod instanceof Byte) {
            byte bByteValue = ((Byte) objDynamicMethod).byteValue();
            if (bByteValue == 1) {
                return true;
            }
            if (bByteValue == 0) {
                return false;
            }
        }
        boolean zL = aiiz.a.a(aihnVar).l(aihnVar);
        if (z) {
            aihnVar.dynamicMethod(aihm.b, true != zL ? null : aihnVar, null);
        }
        return zL;
    }

    protected static aihp mutableCopy(aihp aihpVar) {
        return aihpVar.e(aihpVar.size() << 1);
    }

    protected static Object newMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        return new aijb(messageLite, str, objArr);
    }

    public static aihl newRepeatedGeneratedExtension(MessageLite messageLite, MessageLite messageLite2, aihs aihsVar, int i, aika aikaVar, boolean z, Class cls) {
        return new aihl(messageLite, aija.b, messageLite2, new aihk(aihsVar, i, aikaVar, true, z));
    }

    public static aihl newSingularGeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, aihs aihsVar, int i, aika aikaVar, Class cls) {
        return new aihl(messageLite, obj, messageLite2, new aihk(aihsVar, i, aikaVar, false, false));
    }

    public static aihn parseDelimitedFrom(aihn aihnVar, InputStream inputStream) throws aiik {
        aihn partialDelimitedFrom = parsePartialDelimitedFrom(aihnVar, inputStream, ExtensionRegistryLite.a);
        checkMessageInitialized(partialDelimitedFrom);
        return partialDelimitedFrom;
    }

    protected static aihn parseFrom(aihn aihnVar, InputStream inputStream) throws aiik {
        aihn partialFrom = parsePartialFrom(aihnVar, aigm.N(inputStream, SemanticState.Obscured), ExtensionRegistryLite.a);
        checkMessageInitialized(partialFrom);
        return partialFrom;
    }

    private static aihn parsePartialDelimitedFrom(aihn aihnVar, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            aigl aiglVar = new aigl(new axpe(inputStream, aigm.L(i, inputStream), 1, null), SemanticState.Obscured);
            aihn partialFrom = parsePartialFrom(aihnVar, aiglVar, extensionRegistryLite);
            aiglVar.z(0);
            return partialFrom;
        } catch (aiik e) {
            if (e.a) {
                throw new aiik(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new aiik(e2);
        }
    }

    static aihn parsePartialFrom(aihn aihnVar, aigm aigmVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        aihn aihnVarNewMutableInstance = aihnVar.newMutableInstance();
        try {
            aijg aijgVarA = aiiz.a.a(aihnVarNewMutableInstance);
            Object aignVar = aigmVar.k;
            if (aignVar == null) {
                aignVar = new aign(aigmVar);
            }
            aijgVarA.i(aihnVarNewMutableInstance, (aign) aignVar, extensionRegistryLite);
            aijgVarA.g(aihnVarNewMutableInstance);
            return aihnVarNewMutableInstance;
        } catch (aiik e) {
            if (e.a) {
                throw new aiik(e);
            }
            throw e;
        } catch (aijr e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof aiik) {
                throw ((aiik) e3.getCause());
            }
            throw new aiik(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof aiik) {
                throw ((aiik) e4.getCause());
            }
            throw e4;
        }
    }

    protected static void registerDefaultInstance(Class cls, aihn aihnVar) {
        aihnVar.markImmutable();
        parserOrInstanceMap.put(cls, aihnVar);
    }

    final Object buildMessageInfo() {
        return dynamicMethod(aihm.c, null, null);
    }

    final void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    final void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Alert.DURATION_SHOW_INDEFINITELY);
    }

    final int computeHashCode() {
        return aiiz.a.a(this).b(this);
    }

    public final aihf createBuilder() {
        return (aihf) dynamicMethod(aihm.e, null, null);
    }

    protected abstract Object dynamicMethod(aihm aihmVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return aiiz.a.a(this).k(this, (aihn) obj);
    }

    @Override // defpackage.aiis
    public final aihn getDefaultInstanceForType() {
        return (aihn) dynamicMethod(aihm.f, null, null);
    }

    final int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // defpackage.aifs
    public final int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // com.google.protobuf.MessageLite
    public final aiix getParserForType() {
        return (aiix) dynamicMethod(aihm.g, null, null);
    }

    @Override // defpackage.aifs
    public int getSerializedSize(aijg aijgVar) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(aijgVar);
            if (iComputeSerializedSize < 0) {
                throw new IllegalStateException(a.bR(iComputeSerializedSize, "serialized size must be non-negative, was "));
            }
            return iComputeSerializedSize;
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(aijgVar);
        setMemoizedSerializedSize(iComputeSerializedSize2);
        return iComputeSerializedSize2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    final boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    final boolean isMutable() {
        return this.memoizedSerializedSize < 0;
    }

    protected final void makeImmutable() {
        aiiz.a.a(this).g(this);
        markImmutable();
    }

    final void markImmutable() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    protected final void mergeLengthDelimitedField(int i, aigj aigjVar) {
        ensureUnknownFieldsInitialized();
        aijt aijtVar = this.unknownFields;
        aijtVar.c();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        aijtVar.f((i << 3) | 2, aigjVar);
    }

    protected final void mergeUnknownFields(aijt aijtVar) {
        this.unknownFields = aijt.b(this.unknownFields, aijtVar);
    }

    protected final void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        aijt aijtVar = this.unknownFields;
        aijtVar.c();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        aijtVar.f(i << 3, Long.valueOf(i2));
    }

    @Override // com.google.protobuf.MessageLite
    public final aihf newBuilderForType() {
        return (aihf) dynamicMethod(aihm.e, null, null);
    }

    final aihn newMutableInstance() {
        return (aihn) dynamicMethod(aihm.d, null, null);
    }

    protected final boolean parseUnknownField(int i, aigm aigmVar) {
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.g(i, aigmVar);
    }

    final void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    @Override // defpackage.aifs
    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new IllegalStateException(a.bR(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (this.memoizedSerializedSize & Integer.MIN_VALUE) | i;
    }

    @Override // com.google.protobuf.MessageLite
    public final aihf toBuilder() {
        return ((aihf) dynamicMethod(aihm.e, null, null)).mergeFrom(this);
    }

    public String toString() {
        String string = super.toString();
        int i = aiit.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        aiit.b(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(aigs aigsVar) {
        aijg aijgVarA = aiiz.a.a(this);
        Object ahudVar = aigsVar.a;
        if (ahudVar == null) {
            ahudVar = new ahud(aigsVar);
        }
        aijgVarA.m(this, (ahud) ahudVar);
    }

    public static aihn parseDelimitedFrom(aihn aihnVar, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        aihn partialDelimitedFrom = parsePartialDelimitedFrom(aihnVar, inputStream, extensionRegistryLite);
        checkMessageInitialized(partialDelimitedFrom);
        return partialDelimitedFrom;
    }

    public final aihf createBuilder(aihn aihnVar) {
        return createBuilder().mergeFrom(aihnVar);
    }

    protected static aihq mutableCopy(aihq aihqVar) {
        return aihqVar.e(aihqVar.size() << 1);
    }

    public static aihu mutableCopy(aihu aihuVar) {
        return aihuVar.e(aihuVar.size() << 1);
    }

    public static aihv mutableCopy(aihv aihvVar) {
        return aihvVar.e(aihvVar.size() << 1);
    }

    public static aihn parseFrom(aihn aihnVar, aigj aigjVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        aihn partialFrom = parsePartialFrom(aihnVar, aigjVar, extensionRegistryLite);
        checkMessageInitialized(partialFrom);
        return partialFrom;
    }

    public static aihy mutableCopy(aihy aihyVar) {
        return aihyVar.e(aihyVar.size() << 1);
    }

    protected static aihn parseFrom(aihn aihnVar, aigm aigmVar) {
        return parseFrom(aihnVar, aigmVar, ExtensionRegistryLite.a);
    }

    public static aihn parseFrom(aihn aihnVar, aigm aigmVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        aihn partialFrom = parsePartialFrom(aihnVar, aigmVar, extensionRegistryLite);
        checkMessageInitialized(partialFrom);
        return partialFrom;
    }

    public static aiie mutableCopy(aiie aiieVar) {
        return aiieVar.e(aiieVar.size() << 1);
    }

    public static aihn parseFrom(aihn aihnVar, aigj aigjVar) throws aiik {
        aihn from = parseFrom(aihnVar, aigjVar, ExtensionRegistryLite.a);
        checkMessageInitialized(from);
        return from;
    }

    public static aihn parseFrom(aihn aihnVar, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        aihn partialFrom = parsePartialFrom(aihnVar, aigm.N(inputStream, SemanticState.Obscured), extensionRegistryLite);
        checkMessageInitialized(partialFrom);
        return partialFrom;
    }

    protected static aihn parseFrom(aihn aihnVar, ByteBuffer byteBuffer) {
        return parseFrom(aihnVar, byteBuffer, ExtensionRegistryLite.a);
    }

    public static aihn parseFrom(aihn aihnVar, ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        aihn from = parseFrom(aihnVar, aigm.U(byteBuffer), extensionRegistryLite);
        checkMessageInitialized(from);
        return from;
    }

    public static aihn parseFrom(aihn aihnVar, byte[] bArr) throws aiik {
        aihn partialFrom = parsePartialFrom(aihnVar, bArr, 0, bArr.length, ExtensionRegistryLite.a);
        checkMessageInitialized(partialFrom);
        return partialFrom;
    }

    public static aihn parseFrom(aihn aihnVar, byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        aihn partialFrom = parsePartialFrom(aihnVar, bArr, 0, bArr.length, extensionRegistryLite);
        checkMessageInitialized(partialFrom);
        return partialFrom;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    @Override // defpackage.aiis
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    protected static aihn parsePartialFrom(aihn aihnVar, aigm aigmVar) {
        return parsePartialFrom(aihnVar, aigmVar, ExtensionRegistryLite.a);
    }

    private static aihn parsePartialFrom(aihn aihnVar, aigj aigjVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        aigm aigmVarG = aigjVar.g();
        aihn partialFrom = parsePartialFrom(aihnVar, aigmVarG, extensionRegistryLite);
        aigmVarG.z(0);
        return partialFrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static aihn parsePartialFrom(aihn aihnVar, byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        if (i2 == 0) {
            return aihnVar;
        }
        aihn aihnVarNewMutableInstance = aihnVar.newMutableInstance();
        try {
            aijg aijgVarA = aiiz.a.a(aihnVarNewMutableInstance);
            aijgVarA.j(aihnVarNewMutableInstance, bArr, i, i + i2, new aifw(extensionRegistryLite));
            aijgVarA.g(aihnVarNewMutableInstance);
            return aihnVarNewMutableInstance;
        } catch (aiik e) {
            if (e.a) {
                throw new aiik(e);
            }
            throw e;
        } catch (aijr e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof aiik) {
                throw ((aiik) e3.getCause());
            }
            throw new aiik(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
