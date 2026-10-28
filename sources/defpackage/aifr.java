package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aifr implements aiir {
    protected static void addAll(Iterable iterable, List list) {
        iterable.getClass();
        if (!(iterable instanceof aiin)) {
            if (iterable instanceof aiiy) {
                list.addAll((Collection) iterable);
                return;
            } else {
                addAllCheckingNulls(iterable, list);
                return;
            }
        }
        List listA = ((aiin) iterable).a();
        aiin aiinVar = (aiin) list;
        int size = list.size();
        for (Object obj : listA) {
            if (obj == null) {
                String str = "Element at index " + (aiinVar.size() - size) + " is null.";
                int size2 = aiinVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    aiinVar.remove(size2);
                }
            } else if (obj instanceof aigj) {
                aiinVar.b();
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                aigj aigjVar = aigj.d;
                try {
                    aigj.H(bArr, 0, length);
                    aiinVar.b();
                } catch (aiik e) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            } else {
                aiinVar.add((String) obj);
            }
        }
    }

    private static void addAllCheckingNulls(Iterable iterable, List list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof aija) {
                ((aija) list).d(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    resetListAndThrow(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            Object obj2 = list2.get(i);
            if (obj2 == null) {
                resetListAndThrow(list, size2);
            }
            list.add(obj2);
        }
    }

    private String getReadingExceptionMessage(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    protected static aijr newUninitializedMessageException(MessageLite messageLite) {
        return new aijr();
    }

    private static void resetListAndThrow(List list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: clone */
    public abstract aifr mo53clone();

    protected abstract aifr internalMergeFrom(aifs aifsVar);

    public boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        int iL = aigm.L(i, inputStream);
        if (iL < 0) {
            throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        m57mergeFrom((InputStream) new axpe(inputStream, iL, 1, null), extensionRegistryLite);
        return true;
    }

    @Override // defpackage.aiir
    public aifr mergeFrom(aigj aigjVar) throws aiik {
        try {
            aigm aigmVarG = aigjVar.g();
            m55mergeFrom(aigmVarG);
            aigmVarG.z(0);
            return this;
        } catch (aiik e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    @Override // defpackage.aiir
    public abstract aifr mergeFrom(aigm aigmVar, ExtensionRegistryLite extensionRegistryLite);

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aifr m54mergeFrom(aigj aigjVar, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        try {
            aigm aigmVarG = aigjVar.g();
            mergeFrom(aigmVarG, extensionRegistryLite);
            aigmVarG.z(0);
            return this;
        } catch (aiik e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aifr m55mergeFrom(aigm aigmVar) {
        return mergeFrom(aigmVar, ExtensionRegistryLite.a);
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, ExtensionRegistryLite.a);
    }

    @Override // defpackage.aiir
    public aifr mergeFrom(MessageLite messageLite) {
        return internalMergeFrom((aifs) messageLite);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aifr m56mergeFrom(InputStream inputStream) {
        aigm aigmVarN = aigm.N(inputStream, SemanticState.Obscured);
        m55mergeFrom(aigmVarN);
        aigmVarN.z(0);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aifr m57mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        aigm aigmVarN = aigm.N(inputStream, SemanticState.Obscured);
        mergeFrom(aigmVarN, extensionRegistryLite);
        aigmVarN.z(0);
        return this;
    }

    @Override // defpackage.aiir
    public aifr mergeFrom(byte[] bArr) {
        return mo58mergeFrom(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public aifr mo58mergeFrom(byte[] bArr, int i, int i2) throws aiik {
        try {
            aigm aigmVarO = aigm.O(bArr, i, i2, false);
            m55mergeFrom(aigmVarO);
            aigmVarO.z(0);
            return this;
        } catch (aiik e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public aifr mo59mergeFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        try {
            aigm aigmVarO = aigm.O(bArr, i, i2, false);
            mergeFrom(aigmVarO, extensionRegistryLite);
            aigmVarO.z(0);
            return this;
        } catch (aiik e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    @Override // defpackage.aiir
    public aifr mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return mo59mergeFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Deprecated
    protected static void addAll(Iterable iterable, Collection collection) {
        addAll(iterable, (List) collection);
    }
}
