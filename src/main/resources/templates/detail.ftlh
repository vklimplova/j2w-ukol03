[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>
<div class="detail">
    <div class="vizitka">
        <div class="jmeno">${detail.jmeno}</div>
        <div class="firma">${detail.firma}</div>
        <div class="udaje">
            <div class="adresa">
                <div>${detail.ulice}</div>
                <div>${detail.obecPsc}</div>
            </div>
            <div class="kontakty">
                [#if detail.email??]
                <div><i class="las la-at"></i> <span>${detail.email}</span></div>
                [/#if]
                [#if detail.telefon??]
                    <div><i class="las la-at"></i> <span>${detail.telefon}</span></div>
                [/#if]
                [#if detail.web??]
                    <div><i class="las la-at"></i> <span>${detail.web}</span></div>
                [/#if]
            </div>
        </div>
    </div>


    <div class="mapa">
        <iframe style="border:none" src="https://frame.mapy.cz/?q=${detail.celaAdresa?url}" width="100%" height="100%" frameborder="0"></iframe>
    </div>

</div>
</body>
</html>
