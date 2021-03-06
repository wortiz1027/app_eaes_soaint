<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:tns="http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_GetFile/v1.0" xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction" xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20" xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions" xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator" xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas" xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue" xmlns:ns0="http://www.stellent.com/GetFile/" xmlns:oraxsl="http://www.oracle.com/XSL/Transform/java" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" exclude-result-prefixes=" xsd oracle-xsl-mapper xsi xsl ns0 tns mhdr oraext xp20 xref socket dvm oraxsl"
                xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                xmlns:plnk="http://docs.oasis-open.org/wsbpel/2.0/plnktype"
                xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
                xmlns:client="http://xmlns.oracle.com/app_eaes_soaint/SOA_Content/bpel_GetFile">
   <oracle-xsl-mapper:schema>
      <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
      <oracle-xsl-mapper:mapSources>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/resources/SOA/WSDLs/GetFile.wsdl"/>
            <oracle-xsl-mapper:rootElement name="GetFileByIDResponse" namespace="http://www.stellent.com/GetFile/"/>
         </oracle-xsl-mapper:source>
      </oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:mapTargets>
         <oracle-xsl-mapper:target type="WSDL">
            <oracle-xsl-mapper:schema location="../WSDLs/bpel_GetFile.wsdl"/>
            <oracle-xsl-mapper:rootElement name="output" namespace="http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_GetFile/v1.0"/>
         </oracle-xsl-mapper:target>
      </oracle-xsl-mapper:mapTargets>
      <!--GENERATED BY ORACLE XSL MAPPER 12.2.1.3.0(XSLT Build 170820.1700.2557) AT [SAT APR 04 11:45:19 COT 2020].-->
   </oracle-xsl-mapper:schema>
   <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
   <xsl:template match="/">
      <tns:output>
         <tns:GetFileByIDResult>
            <xsl:if test="count (/ns0:GetFileByIDResponse/ns0:GetFileByIDResult/ns0:FileInfo ) > 0">
               <xsl:for-each select="/ns0:GetFileByIDResponse/ns0:GetFileByIDResult/ns0:FileInfo">
                  <tns:InformacionArhivo>
                     <tns:dID>
                        <xsl:value-of select="ns0:dID"/>
                     </tns:dID>
                     <tns:dDocName>
                        <xsl:value-of select="ns0:dDocName"/>
                     </tns:dDocName>
                     <tns:titulo>
                        <xsl:value-of select="ns0:dDocTitle"/>
                     </tns:titulo>
                     <tns:tipo>
                        <xsl:value-of select="ns0:dDocType"/>
                     </tns:tipo>
                     <tns:autor>
                        <xsl:value-of select="ns0:dDocAuthor"/>
                     </tns:autor>
                     <tns:grupoSeguridad>
                        <xsl:value-of select="ns0:dSecurityGroup"/>
                     </tns:grupoSeguridad>
                  </tns:InformacionArhivo>
               </xsl:for-each>
            </xsl:if>
            <tns:ArchivoDescargado>
               <tns:nombreArchivo>
                  <xsl:value-of select="/ns0:GetFileByIDResponse/ns0:GetFileByIDResult/ns0:downloadFile/ns0:fileName"/>
               </tns:nombreArchivo>
               <tns:contenidoArchivo>
                  <xsl:value-of select="/ns0:GetFileByIDResponse/ns0:GetFileByIDResult/ns0:downloadFile/ns0:fileContent"/>
               </tns:contenidoArchivo>
            </tns:ArchivoDescargado>
            <tns:status>
               <tns:codigo>
                  <xsl:value-of select="/ns0:GetFileByIDResponse/ns0:GetFileByIDResult/ns0:StatusInfo/ns0:statusCode"/>
               </tns:codigo>
               <tns:mensaje>
                  <xsl:value-of select="/ns0:GetFileByIDResponse/ns0:GetFileByIDResult/ns0:StatusInfo/ns0:statusMessage"/>
               </tns:mensaje>
            </tns:status>
         </tns:GetFileByIDResult>
      </tns:output>
   </xsl:template>
</xsl:stylesheet>
