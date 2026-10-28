package defpackage;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aifs implements MessageLite {
    protected transient int memoizedHashCode = 0;

    public static void addAll(Iterable iterable, List list) {
        aifr.addAll(iterable, list);
    }

    protected static void checkByteStringIsUtf8(aigj aigjVar) {
        if (!aigjVar.p()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(aijg aijgVar) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iA = aijgVar.a(this);
        setMemoizedSerializedSize(iA);
        return iA;
    }

    public aiiw mutableCopy() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public aijr newUninitializedMessageException() {
        return new aijr();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            if (serializedSize == 0) {
                return aiif.a;
            }
            byte[] bArr = new byte[serializedSize];
            aigo aigoVar = new aigo(bArr, 0, serializedSize, null);
            writeTo(aigoVar);
            aigoVar.P();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // com.google.protobuf.MessageLite
    public aigj toByteString() {
        try {
            int serializedSize = getSerializedSize();
            aigj aigjVar = aigj.d;
            byte[] bArr = new byte[serializedSize];
            aigo aigoVar = new aigo(bArr, 0, serializedSize, null);
            writeTo(aigoVar);
            aigoVar.P();
            return new aigh(bArr);
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iNumberOfLeadingZeros = ((352 - (Integer.numberOfLeadingZeros(serializedSize) * 9)) >>> 6) + serializedSize;
        if (iNumberOfLeadingZeros > 4096) {
            iNumberOfLeadingZeros = 4096;
        }
        aigr aigrVar = new aigr(outputStream, iNumberOfLeadingZeros);
        aigrVar.y(serializedSize);
        writeTo(aigrVar);
        aigrVar.d();
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        aigr aigrVar = new aigr(outputStream, serializedSize);
        writeTo(aigrVar);
        aigrVar.d();
    }
}
