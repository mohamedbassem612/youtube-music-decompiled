package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeGetAssetService$GetAssetResponse;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vbh {
    public final InnertubeGetAssetService$GetAssetResponse a;
    public final agkj b;

    public vbh(InnertubeGetAssetService$GetAssetResponse innertubeGetAssetService$GetAssetResponse, agkj agkjVar) {
        if (innertubeGetAssetService$GetAssetResponse == null) {
            throw new NullPointerException("Null getAssetResponse");
        }
        this.a = innertubeGetAssetService$GetAssetResponse;
        this.b = agkjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vbh) {
            vbh vbhVar = (vbh) obj;
            if (this.a.equals(vbhVar.a) && aguu.q(this.b, vbhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        agkj agkjVar = this.b;
        return "XenoAssetModel{getAssetResponse=" + this.a.toString() + ", assetParallelDataModels=" + String.valueOf(agkjVar) + '}';
    }

    public vbh() {
        throw null;
    }
}
