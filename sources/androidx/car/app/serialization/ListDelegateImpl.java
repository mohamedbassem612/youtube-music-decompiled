package androidx.car.app.serialization;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.aag;
import defpackage.aer;
import defpackage.aex;
import defpackage.awrc;
import defpackage.xy;
import defpackage.yf;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class ListDelegateImpl implements aer {
    private int _size;
    private int listHashCode;
    private IRemoteList mStub;

    /* JADX INFO: compiled from: PG */
    public final class RemoteListStub extends IRemoteList.Stub {
        private final List mContent;

        public RemoteListStub(List list) {
            list.getClass();
            this.mContent = list;
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public void requestItemRange(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            iOnDoneCallback.getClass();
            aag.b(iOnDoneCallback, "lazy load content", new aex() { // from class: aes
                @Override // defpackage.aex
                public final Object a() {
                    return this.a.mContent.subList(i, i2 + 1);
                }
            });
        }
    }

    public ListDelegateImpl(List list) {
        list.getClass();
        this._size = -1;
        this.listHashCode = -1;
        this._size = list.size();
        this.listHashCode = list.hashCode();
        this.mStub = new RemoteListStub(list);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ListDelegateImpl) && ((ListDelegateImpl) obj).listHashCode == this.listHashCode;
    }

    public int getSize() {
        return this._size;
    }

    public int hashCode() {
        return this.listHashCode;
    }

    public void requestItemRange(int i, int i2, xy xyVar) {
        xyVar.getClass();
        try {
            IRemoteList iRemoteList = this.mStub;
            if (iRemoteList == null) {
                awrc.b("mStub");
                iRemoteList = null;
            }
            iRemoteList.requestItemRange(i, i2, new RemoteUtils$1(xyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return "ListDelegate { Size: " + getSize() + ", listHashCode: " + this.listHashCode + " }";
    }

    private ListDelegateImpl() {
        this._size = -1;
        this.listHashCode = -1;
    }
}
