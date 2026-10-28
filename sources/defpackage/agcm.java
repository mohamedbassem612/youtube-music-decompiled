package defpackage;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agcm extends InstanceProxy {
    public final agcl a;

    public agcm(agcl agclVar) {
        this.a = agclVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '437092259'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '437092259'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 854136778 || i == 581992393;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x011b  */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        agev agevVarI;
        Spanned spannedN;
        if (i != 854136778) {
            if (i != 581992393) {
                throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '437092259'."));
            }
            asts astsVar = (asts) aihn.parseFrom(asts.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcl agclVar = this.a;
            Object[] array = astsVar.c.toArray(new String[0]);
            agev agevVar = (agev) agclVar.a;
            if (agevVar.g()) {
                long j = astsVar.b;
            }
            Spanned spannedN2 = rnj.n(astsVar.d, array);
            aihf aihfVarCreateBuilder = astu.a.createBuilder();
            askp askpVarD = nsh.d(spannedN2);
            aihfVarCreateBuilder.copyOnWrite();
            astu astuVar = (astu) aihfVarCreateBuilder.instance;
            askpVarD.getClass();
            astuVar.c = askpVarD;
            astuVar.b |= 1;
            return ((astu) aihfVarCreateBuilder.build()).toByteArray();
        }
        astt asttVar = (astt) aihn.parseFrom(astt.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agcl agclVar2 = this.a;
        Object[] array2 = asttVar.c.toArray(new String[0]);
        agev agevVar2 = (agev) agclVar2.a;
        if (agevVar2.g()) {
            long j2 = asttVar.b;
            if (j2 == 3639489237760028038L) {
                agevVarI = agev.i(Integer.valueOf(R.string.offline_failed_status));
            } else if (j2 == 3564329609145279850L) {
                agevVarI = agev.i(Integer.valueOf(R.string.offline_unplayable_status));
            } else if (j2 == 6748788686784522116L) {
                agevVarI = agev.i(Integer.valueOf(R.string.offline_expired_status));
            } else if (j2 == 5353923637977938898L) {
                agevVarI = agev.i(Integer.valueOf(R.string.offline_file_not_found_status));
            } else if (j2 == 768808701346463813L) {
                agevVarI = agev.i(Integer.valueOf(R.string.offline_sd_card_error_status));
            } else if (j2 == 7580328753858658465L) {
                agevVarI = agev.i(Integer.valueOf(R.string.offline_disk_write_error_status));
            } else if (j2 == 2970701095724991678L) {
                agevVarI = agev.i(Integer.valueOf(R.string.offline_waiting_status));
            } else if (j2 == 1725673102255280420L) {
                agevVarI = agev.i(Integer.valueOf(R.string.offline_downloading_status));
            } else if (j2 == 5938448539901337619L) {
                agevVarI = agev.i(Integer.valueOf(R.string.offline_waiting_for_network_status));
            } else if (j2 == 6673268948802091809L) {
                agevVarI = agev.i(Integer.valueOf(R.string.offline_waiting_for_wifi_status));
            } else if (j2 == 6396196060126861016L) {
                agevVarI = agev.i(Integer.valueOf(R.string.offline_waiting_for_space_status));
            } else {
                agevVarI = agdf.a;
            }
        } else {
            agevVarI = agdf.a;
        }
        if (agevVarI.g()) {
            spannedN = rnj.n(Html.toHtml(new SpannedString(((Context) ((rnj) agclVar2.b).a).getText(((Integer) agevVarI.c()).intValue())), 1), array2);
        } else {
            spannedN = rnj.n(asttVar.d, array2);
        }
        aihf aihfVarCreateBuilder2 = astu.a.createBuilder();
        askp askpVarD2 = nsh.d(spannedN);
        aihfVarCreateBuilder2.copyOnWrite();
        astu astuVar2 = (astu) aihfVarCreateBuilder2.instance;
        askpVarD2.getClass();
        astuVar2.c = askpVarD2;
        astuVar2.b |= 1;
        return ((astu) aihfVarCreateBuilder2.build()).toByteArray();
    }
}
