<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:strip-space elements="*" />

<xsl:template match="/">
  <html>
    <head><title>Práctica de transformación</title></head>
    
    <body>
    
      <table border="1" style="margin: 0 auto;">
        <tr>
          <th>Apellidos</th>
          <th>Nombre</th>
          <th>Nota</th>
          <th>Convocatoria</th>
        </tr>
    
      <xsl:for-each select="/notas/alumno[@convocatoria='Junio']">
        <p>
          <xsl:value-of select="apellidos"/>
          <xsl:text>, </xsl:text>
          <xsl:value-of select="nombre"/>
          <xsl:text> - </xsl:text>
          <xsl:value-of select="final"/>
          <xsl:text> *** </xsl:text>
          <xsl:value-of select="@convocatoria"/>
        </p>
        </xsl:for-each>
        
    </body>
  
    </html>
</xsl:template>

</xsl:stylesheet>